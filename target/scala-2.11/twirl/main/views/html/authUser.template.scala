
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
    <link rel="stylesheet" href=""""),_display_(/*9.35*/routes/*9.41*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*9.91*/("""">
    <script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*10.74*/("""" type="text/javascript"></script>
  </head>
  <body>
  """),_display_(/*13.4*/content),format.raw/*13.11*/("""
  """),format.raw/*14.3*/("""</body>
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
                  DATE: Wed Jun 15 15:27:47 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/authUser.scala.html
                  HASH: d2ae96365a4c6f46a2d4093987ce10d8c18c353d
                  MATRIX: 609->25|763->84|791->86|872->141|897->146|966->189|980->195|1050->245|1098->266|1113->272|1183->321|1266->378|1294->385|1324->388
                  LINES: 23->2|28->2|30->4|34->8|34->8|35->9|35->9|35->9|36->10|36->10|36->10|39->13|39->13|40->14
                  -- GENERATED --
              */
          