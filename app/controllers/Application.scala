package controllers

import javax.inject.Inject

import akka.actor.{Actor, ActorSystem, Props}
import be.objectify.deadbolt.scala.ActionBuilders
import models._
import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.libs.mailer._
import play.api.mvc._
import repos.{SubscriptionsRepo, UsersRepo}
import security.AuthSupport

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._


/**
  * @author Steve Chaloner (steve@objectify.be)
  */

class Application @Inject()(system: ActorSystem, mailerClient: MailerClient, actionBuilder: ActionBuilders, authSupport: AuthSupport, usersRepo: UsersRepo, subscriptionsRepo: SubscriptionsRepo,
                            val messagesApi: MessagesApi) extends Controller with I18nSupport {

  val Home = Redirect(routes.Application.list())

  def getCurrentUser(id: String): Option[User] = {
    val user = usersRepo.findById(id)
    if(user.isEmpty) None
    else Await.result(user.get, 5.seconds)
  }

  val subscriptionForm = Form(
    mapping(
      "id" -> optional(longNumber),
      "date" -> sqlDate("yyyy-MM-dd"),
      "cost" -> longNumber,
      "name" -> nonEmptyText,
      "frequency" -> number(0),
      "category" -> text,
      "userId" -> optional(longNumber))(Subscription.apply)(Subscription.unapply))

  def sendEmail(user: User, subscriptionList: SubscriptionList[Subscription]) = {

    val email = Email(
      "Reminder: Subscription about to Renew",
      "Recur FROM <greeno.tristan@gmail.com>",
      Seq(s"${user.name} TO <${user.name}>"),
      bodyText = Some(s"Your subscriptions will be renewing soon."),
      bodyHtml = Some(
        s"""
      <html lang="en">
      <body>
        <b> The following subscriptions will be renewing soon</b>
        ${subscriptionList.items.map(s => s.name)}
      </body>
      </html>""")
    )

    mailerClient.send(email)
  }


  object MailActor {
    def props = Props[MailActor]

    case class SendMail(user: User, subscriptionList: SubscriptionList[Subscription])
  }

  class MailActor @Inject() extends Actor {
  import MailActor._

    def receive = {
      case SendMail(user: User, subscriptionList: SubscriptionList[Subscription]) => sender() ! sendEmail(user, subscriptionList)
    }
  }

  case class MailToSend(user: User, subscriptionList: SubscriptionList[Subscription])

  val mailActor = system.actorOf(MailActor.props, "mail-actor")

  def list = actionBuilder.SubjectPresentAction().defaultHandler() { authRequest =>
    authSupport.currentUser(authRequest).map(maybeUser => {
      val user = getCurrentUser(maybeUser.get.userId)
      val userId = user.get.id.get
      val allList = Await.result(subscriptionsRepo.list(userId).map(list => list), 10.seconds)
      val renewList = Await.result(subscriptionsRepo.listSubsAboutToRenew(userId).map(list => list), 10.seconds)

      system.scheduler.schedule(
        5.microseconds, 12.hours, mailActor, MailToSend(user.get, renewList))

      Ok(views.html.list(renewList, allList))
    })
  }

  def index = actionBuilder.SubjectPresentAction().defaultHandler() { authRequest =>
    authSupport.currentUser(authRequest).map(maybeUser => {
      var user = getCurrentUser(maybeUser.get.userId)

      if(user.isEmpty) {
        usersRepo.insert(User.apply(null, maybeUser.get.userId, maybeUser.get.name, maybeUser.get.avatarUrl))
        user = getCurrentUser(maybeUser.get.userId)
      }

      Ok(views.html.index("Recur", user, usersRepo))
    })
  }

  def create = actionBuilder.SubjectPresentAction().defaultHandler() { authRequest =>
    authSupport.currentUser(authRequest).map(maybeUser => {
      val user = getCurrentUser(maybeUser.get.userId)

      Ok(views.html.createForm(subscriptionForm, user.get))
    })
  }


  def edit(id: Long) = Action.async { implicit rs =>
    val subscriptionGiven = for {
      subscription <- subscriptionsRepo.findById(id)
    } yield subscription

    subscriptionGiven.map {
      case (subscription) =>
        subscription match {
          case Some(s) => Ok(views.html.editForm(id, subscriptionForm))
          case None => NotFound
        }
    }
  }

  def update(id: Long) =  Action { implicit request =>

    subscriptionForm.bindFromRequest.fold(
      formWithErrors => BadRequest(views.html.editForm(id, formWithErrors)),
      subscription => {
          subscriptionsRepo.update(id, subscription)
          Home.flashing("success" -> "Subscription updated")
      }
    )
  }

  def save(id: String) = Action { implicit request =>
    subscriptionForm.bindFromRequest.fold(
      formWithErrors => {
        println("Error here")
        BadRequest(views.html.createForm(formWithErrors, getCurrentUser(id).get))
      },
      subscription => {
        subscriptionsRepo.insert(subscription)
        Home.flashing("success" -> s"Subscription ${subscription.name} has been added.")
      }
    )
  }

  def delete(id: Long) = Action { implicit request =>
    subscriptionsRepo.delete(id).map(_ => ())

    Home.flashing("success" -> "Subscription successfully deleted")
  }

}