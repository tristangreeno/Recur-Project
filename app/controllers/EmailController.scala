package controllers

import javax.inject.Inject

import models._
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.libs.mailer._
import play.api.mvc._
import repos.{SubscriptionsRepo, UsersRepo}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._

/**
  * Created by tristangreeno on 6/16/16.
  */
class EmailController @Inject()(application: Application, mailerClient: MailerClient, usersRepo: UsersRepo, subscriptionsRepo: SubscriptionsRepo,
                                 val messagesApi: MessagesApi) extends Controller with I18nSupport {

  def sendEmail = Action { implicit request =>

    val users = Await.result(usersRepo.options(), 10.seconds)

    for (user <- users) yield {
        val userId = user.id.get
        val renewList = Await.result(subscriptionsRepo.listSubsAboutToRenew(userId).map(list => list), 10.seconds)

        val email = Email(
      "Reminder: Subscription about to Renew",
      "Recur Application <recur.application@gmail.com>",
      Seq(s"${user.email} TO <${user.email}>"),
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

    mailerClient.send(email)}

    Ok


  }
}
