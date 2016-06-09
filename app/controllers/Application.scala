package controllers

import javax.inject.Inject

import be.objectify.deadbolt.scala.ActionBuilders
import models._
import play.api.cache.CacheApi
import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._
import repos.{SubscriptionsRepo, UsersRepo}
import security.AuthSupport

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._


/**
  * @author Steve Chaloner (steve@objectify.be)
  */

class Application @Inject()(cacheApi: CacheApi, actionBuilder: ActionBuilders, authSupport: AuthSupport, usersRepo: UsersRepo, subscriptionsRepo: SubscriptionsRepo,
                            val messagesApi: MessagesApi) extends Controller with I18nSupport {

  val Home = Redirect(routes.Application.list())

  def getCurrentUser(id: Long): Option[User] = {
    Await.result(usersRepo.findById(id), Duration.Inf)
  }

  val id: Long = 9

  val subscriptionForm = Form(
    mapping(
      "id" -> optional(longNumber),
      "date" -> sqlDate("yyyy-MM-dd"),
      "cost" -> longNumber,
      "name" -> nonEmptyText,
      "frequency" -> number(0),
      "userId" -> optional(longNumber))(Subscription.apply)(Subscription.unapply))

  def list(page: Int, orderBy: Int, filter: String) = Action.async { implicit request =>
    val subscriptions = subscriptionsRepo.list(page = page, orderBy = orderBy, filter = "%" + filter + "%")
    subscriptions.map(s => Ok(views.html.list(s, orderBy, filter)))
  }

  def index = Action { implicit request =>
    Ok(views.html.index("Recur", getCurrentUser(id), usersRepo))
  }

  def create = Action { implicit request =>

    Ok(views.html.createForm(subscriptionForm, id))
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

  def save = Action { implicit request =>

    subscriptionForm.bindFromRequest.fold(
      formWithErrors => BadRequest(views.html.createForm(formWithErrors, id)),
      subscription => {
        subscriptionsRepo.insert(subscription)
        Home.flashing("success" -> s"Subscription ${subscription.name} has been added.")
      }
    )
  }

  def delete(id: Long) = Action { implicit request =>
    subscriptionsRepo.delete(id)
    Home.flashing("success" -> "Subscription successfully deleted")
  }

  /*
  def createNewUser(userId: String, name: String, avatarUrl: String) = Action {
    implicit request =>

    if(usersRepo.findUserExistence(userId)) {
      usersRepo.insert(User.apply(null, userId, name, avatarUrl))
      Home.flashing("success" -> "User added")
    }

    else { Home }
  }*/

}