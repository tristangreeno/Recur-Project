package controllers

import javax.inject.Inject

import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.libs.mailer._
import play.api.mvc._
import repos.{SubscriptionsRepo, UsersRepo}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._

/**
  * Controls the email capability of the Recur application.
  * Should be called via a curl command using Scheduler or a CronJob.
  */
class EmailController @Inject()(application: Application, mailerClient: MailerClient, usersRepo: UsersRepo, subscriptionsRepo: SubscriptionsRepo,
                                 val messagesApi: MessagesApi) extends Controller with I18nSupport {
  def sendEmail = Action.async { implicit request =>

    usersRepo.options().map(users =>

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
      </html>

          <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8"> <!-- utf-8 works for most cases -->
    <meta name="viewport" content="width=device-width"> <!-- Forcing initial-scale shouldn't be necessary -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge"> <!-- Use the latest (edge) version of IE rendering engine -->
    <title></title> <!-- The title tag shows in email notifications, like Android 4.4. -->

    <!-- Web Font / @font-face : BEGIN -->
    <!-- NOTE: If web fonts are not required, lines 9 - 26 can be safely removed. -->

    <!-- Desktop Outlook chokes on web font references and defaults to Times New Roman, so we force a safe fallback font. -->
    <!--[if mso]>
    <style>
        * {
            font-family: sans-serif !important;
        }
    </style>
    <![endif]-->

    <!-- All other clients get the webfont reference; some will render the font and others will silently fail to the fallbacks. More on that here: http://stylecampaign.com/blog/2015/02/webfont-support-in-email/ -->
    <!--[if !mso]><!-->
    <!-- insert web font reference, eg: <link href='https://fonts.googleapis.com/css?family=Roboto:400,700' rel='stylesheet' type='text/css'> -->
    <!--<![endif]-->

    <!-- Web Font / @font-face : END -->

    <!-- CSS Reset -->
    <style type="text/css">
        /* What it does: Remove spaces around the email design added by some email clients. */
        /* Beware: It can remove the padding / margin and add a background color to the compose a reply window. */
        html,
        body {
            margin: 0 auto !important;
            padding: 0 !important;
            height: 100% !important;
            width: 100% !important;
        }

        /* What it does: Stops email clients resizing small text. */
        * {
            -ms-text-size-adjust: 100%;
            -webkit-text-size-adjust: 100%;
        }

        /* What is does: Centers email on Android 4.4 */
        div[style*="margin: 16px 0"] {
            margin:0 !important;
        }

        /* What it does: Stops Outlook from adding extra spacing to tables. */
        table,
        td {
            mso-table-lspace: 0pt !important;
            mso-table-rspace: 0pt !important;
        }

        /* What it does: Fixes webkit padding issue. Fix for Yahoo mail table alignment bug. Applies table-layout to the first 2 tables then removes for anything nested deeper. */
        table {
            border-spacing: 0 !important;
            border-collapse: collapse !important;
            table-layout: fixed !important;
            Margin: 0 auto !important;
        }
        table table table {
            table-layout: auto;
        }

        /* What it does: Uses a better rendering method when resizing images in IE. */
        img {
            -ms-interpolation-mode:bicubic;
        }

        /* What it does: Overrides styles added when Yahoo's auto-senses a link. */
        .yshortcuts a {
            border-bottom: none !important;
        }

        /* What it does: A work-around for iOS meddling in triggered links. */
        .mobile-link--footer a,
        a[x-apple-data-detectors] {
            color:inherit !important;
            text-decoration: underline !important;
        }

    </style>

    <!-- Progressive Enhancements -->
    <style>

        /* What it does: Hover styles for buttons */
        .button-td,
        .button-a {
            transition: all 100ms ease-in;
        }
        .button-td:hover,
        .button-a:hover {
            background: #555555 !important;
            border-color: #555555 !important;
        }
    </style>

</head>
<body width="100%" bgcolor="#222222" style="Margin: 0;">
<center style="width: 100%; background: #222222;">

    <!-- Visually Hidden Preheader Text : BEGIN -->
    <div style="display:none;font-size:1px;line-height:1px;max-height:0px;max-width:0px;opacity:0;overflow:hidden;mso-hide:all;font-family: sans-serif;">
        Your subscriptions will be renewing soon.
    </div>
    <!-- Visually Hidden Preheader Text : END -->

    <!--
        Set the email width. Defined in two places:
        1. max-width for all clients except Desktop Windows Outlook, allowing the email to squish on narrow but never go wider than 600px.
        2. MSO tags for Desktop Windows Outlook enforce a 600px width.
    -->
    <div style="max-width: 600px; margin: auto;">
        <!--[if (gte mso 9)|(IE)]>
        <table cellspacing="0" cellpadding="0" border="0" width="600" align="center">
            <tr>
                <td>
        <![endif]-->

        <!-- Email Body : BEGIN -->
        <table cellspacing="0" cellpadding="0" border="0" align="center" bgcolor="#ffffff" width="100%" style="max-width: 600px;">

            <!-- Hero Image, Flush : BEGIN -->
            <tr>
                <td>
                    <img src="https://s32.postimg.org/crvhtoazp/Recurlogo_300x300b.png" width="600" height="300" alt="alt_text" border="0" align="middle" style="width: 100%; max-width: 600px;">
                </td>
            </tr>
            <!-- Hero Image, Flush : END -->

            <!-- 1 Column Text + Button : BEGIN -->
            <tr>
                <td>
                    <table cellspacing="0" cellpadding="0" border="0" width="100%">
                        <tr>
                            <td style="padding: 40px; font-family: sans-serif; font-size: 15px; mso-height-rule: exactly; line-height: 20px; color: #555555;">
           |                ${renewList.items.map(s => s.name).toList.mkString("\n")}
           |
                                <br><br>
                                <!-- Button : Begin -->
                                <table cellspacing="0" cellpadding="0" border="0" align="center" style="Margin: auto;">
                                    <tr>
                                        <td style="border-radius: 3px; background: #222222; text-align: center;" class="button-td">
                                            <a href="https://glacial-brook-71360.herokuapp.com/" style="background: #222222; border: 15px solid #222222; font-family: sans-serif; font-size: 13px; line-height: 1.1; text-align: center; text-decoration: none; display: block; border-radius: 3px; font-weight: bold;" class="button-a">
                                                &nbsp;&nbsp;&nbsp;&nbsp;<span style="color:#ffffff">View your subscriptions now</span>&nbsp;&nbsp;&nbsp;&nbsp;
                                            </a>
                                        </td>
                                    </tr>
                                </table>
                                <!-- Button : END -->


        </table>
        <!-- Email Body : END -->

        <!-- Email Footer : BEGIN -->
        <table cellspacing="0" cellpadding="0" border="0" align="center" width="100%" style="max-width: 680px;">
            <tr>
                <td style="padding: 40px 10px;width: 100%;font-size: 12px; font-family: sans-serif; mso-height-rule: exactly; line-height:18px; text-align: center; color: #888888;">
                    <br><br>
                    Recur<br><span class="mobile-link--footer">Questions? Comments? Contact me: tristan@tristangreeno.com</span>
                    <br><br>
                </td>
            </tr>
        </table>
        <!-- Email Footer : END -->

        <!--[if (gte mso 9)|(IE)]>
        </td>
        </tr>
        </table>
        <![endif]-->
    </div>
</center>
</body>
</html>""")
    )

    mailerClient.send(email)}
    ).map(s => Ok)
  }
}
