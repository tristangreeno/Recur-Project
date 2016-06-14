
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object authUser_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object authUser_Scope1 {
import models.AuthUser

class authUser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Option[AuthUser],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String, maybeUser: Option[AuthUser])(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.61*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>

<html lang="en">
  <head>
    <title>"""),_display_(/*8.13*/title),format.raw/*8.18*/("""</title>
  </head>
  <body>
  """),_display_(/*11.4*/content),format.raw/*11.11*/("""
  """),format.raw/*12.3*/("""</body>
</html>"""))
      }
    }
  }

  def render(title:String,maybeUser:Option[AuthUser],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,maybeUser)(content)

  def f:((String,Option[AuthUser]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,maybeUser) => (content) => apply(title,maybeUser)(content)

  def ref: this.type = this

}


}
}

/**/
object authUser extends authUser_Scope0.authUser_Scope1.authUser
              /*
                  -- GENERATED --
                  DATE: Wed Jun 08 17:44:40 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/authUser.scala.html
                  HASH: 35894f255384f43f4a2ed2da2360d7a4aa4718aa
                  MATRIX: 609->25|763->84|791->86|872->141|897->146|954->177|982->184|1012->187
                  LINES: 23->2|28->2|30->4|34->8|34->8|37->11|37->11|38->12
                  -- GENERATED --
              */
          