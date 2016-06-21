
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object index_Scope1 {
import models._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Option[User],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(title: String, maybeUser: Option[User])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.71*/("""


    """),_display_(/*7.6*/main(title, maybeUser)/*7.28*/ {_display_(Seq[Any](format.raw/*7.30*/("""
        """),_display_(/*8.10*/if(maybeUser.isDefined)/*8.33*/ {_display_(Seq[Any](format.raw/*8.35*/("""

            """),_display_(/*10.14*/routes/*10.20*/.Application.list()),format.raw/*10.39*/("""


        """)))}),format.raw/*13.10*/("""
    """)))}),format.raw/*14.6*/("""
"""))
      }
    }
  }

  def render(title:String,maybeUser:Option[User],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(title,maybeUser)(messages)

  def f:((String,Option[User]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (title,maybeUser) => (messages) => apply(title,maybeUser)(messages)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Tue Jun 21 17:01:34 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/index.scala.html
                  HASH: cd3358ac224ed26d0279ca5c1129cca0cbfd7afa
                  MATRIX: 593->20|757->89|790->97|820->119|859->121|895->131|926->154|965->156|1007->171|1022->177|1062->196|1105->208|1141->214
                  LINES: 23->4|28->4|31->7|31->7|31->7|32->8|32->8|32->8|34->10|34->10|34->10|37->13|38->14
                  -- GENERATED --
              */
          