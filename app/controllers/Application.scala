package controllers

import javax.inject.Inject

import repos.{SubscriptionsComponent, SubscriptionsRepo, UsersComponent, UsersRepo}
import be.objectify.deadbolt.scala.ActionBuilders
import models.Subscription
import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.Messages.Implicits._
import play.api.Play.current
import security.AuthSupport
import play.api.mvc.{Action, Controller}
import views.html

import scala.concurrent.ExecutionContext.Implicits.global

/**
  * @author Steve Chaloner (steve@objectify.be)
  */

class Application @Inject()(actionBuilder: ActionBuilders, authSupport: AuthSupport, usersRepo: UsersRepo, subscriptionsRepo: SubscriptionsRepo) extends Controller {

  val subscriptionForm = Form(
    mapping(
      "id" -> optional(longNumber),
      "date" -> sqlDate("mm-dd-yyyy"),
      "cost" -> longNumber,
      "name" -> nonEmptyText,
      "frequency" -> number(0),
      "userId" -> text,
      "category" -> nonEmptyText)(Subscription.apply)(Subscription.unapply))

  def index = actionBuilder.SubjectPresentAction().defaultHandler() { authRequest =>
    authSupport.currentUser(authRequest).map(maybeUser =>
      Ok(views.html.index("Protected content", maybeUser, subscriptionForm)))
  }





  /*def create = Action.async {
    implicit rs => UsersRepo.options().map(options => Ok(index(computerForm, options))
  }*/
}
