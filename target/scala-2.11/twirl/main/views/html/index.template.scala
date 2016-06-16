
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
<<<<<<< HEAD

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Option[User],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(title: String, maybeUser: Option[User])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
=======
import repos.UsersRepo

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Option[User],UsersRepo,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(title: String, maybeUser: Option[User], usersRepo: UsersRepo)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
    _display_ {
      {


<<<<<<< HEAD
Seq[Any](format.raw/*3.71*/("""

    """),_display_(/*5.6*/main(title, maybeUser)/*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""
        """),_display_(/*6.10*/if(maybeUser.isDefined)/*6.33*/ {_display_(Seq[Any](format.raw/*6.35*/("""
            """),_display_(/*7.14*/defining(maybeUser.get)/*7.37*/ { user =>_display_(Seq[Any](format.raw/*7.47*/("""
                """),format.raw/*8.17*/("""<p>Hello """),_display_(/*8.27*/user/*8.31*/.email),format.raw/*8.37*/("""</p>
                <img src=""""),_display_(/*9.28*/user/*9.32*/.avatarUrl),format.raw/*9.42*/(""""/>
            """)))}),format.raw/*10.14*/("""


            """),format.raw/*13.13*/("""<p>
                <a href=""""),_display_(/*14.27*/controllers/*14.38*/.routes.Application.list()),format.raw/*14.64*/("""">View Subscriptions</a>
                <a href=""""),_display_(/*15.27*/controllers/*15.38*/.routes.AuthController.logOut()),format.raw/*15.69*/("""">Sign Out</a>
            </p>
        """)))}),format.raw/*17.10*/("""
    """)))}),format.raw/*18.6*/("""
=======
Seq[Any](format.raw/*4.93*/("""

    """),_display_(/*6.6*/main(title, maybeUser)/*6.28*/ {_display_(Seq[Any](format.raw/*6.30*/("""
        """),_display_(/*7.10*/if(maybeUser.isDefined)/*7.33*/ {_display_(Seq[Any](format.raw/*7.35*/("""
            """),_display_(/*8.14*/defining(maybeUser.get)/*8.37*/ { user =>_display_(Seq[Any](format.raw/*8.47*/("""
                """),format.raw/*9.17*/("""<p>Hello """),_display_(/*9.27*/user/*9.31*/.name),format.raw/*9.36*/("""</p>
                <img src=""""),_display_(/*10.28*/user/*10.32*/.avatarUrl),format.raw/*10.42*/(""""/>
            """)))}),format.raw/*11.14*/("""

            """),format.raw/*13.13*/("""<p><a href=""""),_display_(/*13.26*/controllers/*13.37*/.routes.AuthController.logOut()),format.raw/*13.68*/("""">Log out</a></p>
        """)))}),format.raw/*14.10*/("""
    """)))}),format.raw/*15.6*/("""
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
"""))
      }
    }
  }

<<<<<<< HEAD
  def render(title:String,maybeUser:Option[User],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(title,maybeUser)(messages)

  def f:((String,Option[User]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (title,maybeUser) => (messages) => apply(title,maybeUser)(messages)
=======
  def render(title:String,maybeUser:Option[User],usersRepo:UsersRepo,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(title,maybeUser,usersRepo)(messages)

  def f:((String,Option[User],UsersRepo) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (title,maybeUser,usersRepo) => (messages) => apply(title,maybeUser,usersRepo)(messages)
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
<<<<<<< HEAD
                  DATE: Thu Jun 16 14:56:39 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/index.scala.html
                  HASH: cfe0ffc70148531f251f07527af9b2717ef39fb6
                  MATRIX: 593->19|757->88|789->95|819->117|858->119|894->129|925->152|964->154|1004->168|1035->191|1082->201|1126->218|1162->228|1174->232|1200->238|1258->270|1270->274|1300->284|1348->301|1391->316|1448->346|1468->357|1515->383|1593->434|1613->445|1665->476|1737->517|1773->523
                  LINES: 23->3|28->3|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|33->8|34->9|34->9|34->9|35->10|38->13|39->14|39->14|39->14|40->15|40->15|40->15|42->17|43->18
=======
                  DATE: Fri Jun 10 10:53:36 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/index.scala.html
                  HASH: 0f389c5ffa1f168d37972ee10dfdc8a95f848632
                  MATRIX: 626->43|812->134|844->141|874->163|913->165|949->175|980->198|1019->200|1059->214|1090->237|1137->247|1181->264|1217->274|1229->278|1254->283|1313->315|1326->319|1357->329|1405->346|1447->360|1487->373|1507->384|1559->415|1617->442|1653->448
                  LINES: 24->4|29->4|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|35->10|35->10|35->10|36->11|38->13|38->13|38->13|38->13|39->14|40->15
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
                  -- GENERATED --
              */
          