
package views.html.security

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object denied_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object denied_Scope1 {
import models.AuthUser

class denied extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Option[AuthUser],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(maybeUser: Option[AuthUser]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.31*/("""

"""),_display_(/*4.2*/views/*4.7*/.html.authUser(title = "Access Denied", maybeUser = maybeUser)/*4.69*/ {_display_(Seq[Any](format.raw/*4.71*/("""
    """),format.raw/*5.5*/("""<div class="row mt">
        <div class="col-lg-12">
            <p>Access Denied</p>
            <p>You don't have rights to do that.</p>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(maybeUser:Option[AuthUser]): play.twirl.api.HtmlFormat.Appendable = apply(maybeUser)

  def f:((Option[AuthUser]) => play.twirl.api.HtmlFormat.Appendable) = (maybeUser) => apply(maybeUser)

  def ref: this.type = this

}


}
}

/**/
object denied extends denied_Scope0.denied_Scope1.denied
              /*
                  -- GENERATED --
                  DATE: Wed Jun 08 17:44:40 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/security/denied.scala.html
                  HASH: 9e6ee439a91f565db9e5fe54626fe562940f5c7c
                  MATRIX: 600->25|724->54|752->57|764->62|834->124|873->126|904->131
                  LINES: 23->2|28->2|30->4|30->4|30->4|30->4|31->5
                  -- GENERATED --
              */
          