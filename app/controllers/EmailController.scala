package controllers

import javax.inject.Inject

import be.objectify.deadbolt.scala.ActionBuilders
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.libs.mailer._
import play.api.mvc._
import repos.{SubscriptionsRepo, UsersRepo}
import security.AuthSupport

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._

/**
  * Created by tristangreeno on 6/16/16.
  */
class EmailController @Inject()(application: Application, mailerClient: MailerClient, actionBuilder: ActionBuilders, authSupport: AuthSupport, usersRepo: UsersRepo, subscriptionsRepo: SubscriptionsRepo,
                                 val messagesApi: MessagesApi) extends Controller with I18nSupport {

  def sendEmail = actionBuilder.SubjectPresentAction().defaultHandler() { authRequest =>
    authSupport.currentUser(authRequest).map(maybeUser => {

      val user = application.getCurrentUser(maybeUser.get.userId)
      val userId = user.get.id.get
      val allList = Await.result(subscriptionsRepo.list(userId).map(list => list), 10.seconds)
      val renewList = Await.result(subscriptionsRepo.listSubsAboutToRenew(userId).map(list => list), 10.seconds)

      val email = Email(
        "Reminder: Subscription about to Renew",
        "Recur Application <recur.application@gmail.com>",
        Seq(s"${user.get.name} TO <${user.get.name}>"),
        bodyText = Some(s"Your subscriptions will be renewing soon."),
        bodyHtml = Some(
          s"""
      <html lang="en">
      <body>
        <b> The following subscriptions will be renewing soon</b>
        ${renewList.items.map(s => s.name).toList.mkString("\n")}

        <a href="https://glacial-brook-71360.herokuapp.com/subscriptions">Subscriptions List</a>
      </body>
      </html>""")
      )

      if(renewList.items.nonEmpty) { mailerClient.send(email) }

      Ok
    })}

}
