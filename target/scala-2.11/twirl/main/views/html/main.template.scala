
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object main_Scope1 {
import models.User

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Option[User],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String, maybeUser: Option[User])(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.57*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>
    </head>
    <body>
    """),_display_(/*11.6*/content),format.raw/*11.13*/("""
    """),format.raw/*12.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,maybeUser:Option[User],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,maybeUser)(content)

  def f:((String,Option[User]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,maybeUser) => (content) => apply(title,maybeUser)(content)

  def ref: this.type = this

}


}
}

/**/
object main extends main_Scope0.main_Scope1.main
              /*
                  -- GENERATED --
                  DATE: Wed Jun 08 16:15:08 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/main.scala.html
                  HASH: c9956f4cef4450ad40d825b47f5bf1c9cf2b3918
                  MATRIX: 589->21|739->76|767->78|854->139|879->144|942->181|970->188|1002->193
                  LINES: 23->2|28->2|30->4|34->8|34->8|37->11|37->11|38->12
                  -- GENERATED --
              */
          