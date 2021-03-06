package controllers

import javax.inject.Inject

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
  * @author Tristan Greeno (tristan@tristangreeno.com)
  */

class Application @Inject()(mailerClient: MailerClient, actionBuilder: ActionBuilders, authSupport: AuthSupport, usersRepo: UsersRepo, subscriptionsRepo: SubscriptionsRepo,
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
      "date" -> sqlDate,
      "cost" -> longNumber,
      "name" -> nonEmptyText,
      "frequency" -> number,
      "category" -> text,
      "userId" -> optional(longNumber))(Subscription.apply)(Subscription.unapply))


  def list = actionBuilder.SubjectPresentAction().defaultHandler() { authRequest =>
    authSupport.currentUser(authRequest).map(maybeUser => {
      val user = getCurrentUser(maybeUser.get.userId)
      val userId = user.get.id.get
      val allList = Await.result(subscriptionsRepo.list(userId).map(list => list), 10.seconds)
      val renewList = Await.result(subscriptionsRepo.listSubsAboutToRenew(userId).map(list => list), 10.seconds)

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

      Home
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
          case Some(s) => Ok(views.html.editForm(id, subscriptionForm, subscription.get))
          case None => NotFound
        }
    }
  }

  def update(id: Long) =  Action.async { implicit request =>
    subscriptionsRepo.findById(id).map(s =>
    subscriptionForm.bindFromRequest.fold(
      formWithErrors => BadRequest(views.html.editForm(id, formWithErrors, s.get)),
      subscription => {
          subscriptionsRepo.update(id, subscription)
          Home.flashing("success" -> "Subscription updated")
      }
    ))
  }

  def save(id: String) = Action { implicit request =>
    subscriptionForm.bindFromRequest.fold(
      formWithErrors => {
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