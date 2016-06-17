
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
            """),_display_(/*9.14*/defining(maybeUser.get)/*9.37*/ { user =>_display_(Seq[Any](format.raw/*9.47*/("""

                """),format.raw/*11.17*/("""<p>Hello """),_display_(/*11.27*/user/*11.31*/.email),format.raw/*11.37*/("""</p>
                <img src=""""),_display_(/*12.28*/user/*12.32*/.avatarUrl),format.raw/*12.42*/(""""/>
            """)))}),format.raw/*13.14*/("""


            """),format.raw/*16.13*/("""<p>
                <a href=""""),_display_(/*17.27*/controllers/*17.38*/.routes.Application.list()),format.raw/*17.64*/("""">View Subscriptions</a>
                <a href=""""),_display_(/*18.27*/controllers/*18.38*/.routes.AuthController.logOut()),format.raw/*18.69*/("""">Sign Out</a>
            </p>

        """)))}),format.raw/*21.10*/("""
    """)))}),format.raw/*22.6*/("""
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
                  DATE: Thu Jun 16 18:16:16 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/index.scala.html
                  HASH: e86e8a30272999a77c8148b4c6833473cabbeff2
                  MATRIX: 593->20|757->89|790->97|820->119|859->121|895->131|926->154|965->156|1005->170|1036->193|1083->203|1129->221|1166->231|1179->235|1206->241|1265->273|1278->277|1309->287|1357->304|1400->319|1457->349|1477->360|1524->386|1602->437|1622->448|1674->479|1747->521|1783->527
                  LINES: 23->4|28->4|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|35->11|35->11|35->11|35->11|36->12|36->12|36->12|37->13|40->16|41->17|41->17|41->17|42->18|42->18|42->18|45->21|46->22
                  -- GENERATED --
              */
          