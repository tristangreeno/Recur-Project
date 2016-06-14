
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class editForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Long,Form[Subscription],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, subscriptionForm: Form[Subscription])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.79*/("""

    """),format.raw/*4.1*/("""
    """),_display_(/*5.6*/noUser/*5.12*/ {_display_(Seq[Any](format.raw/*5.14*/("""

        """),format.raw/*7.9*/("""<h1>Edit Subscription</h1>

        """),_display_(/*9.10*/form(routes.Application.update(id))/*9.45*/ {_display_(Seq[Any](format.raw/*9.47*/("""

            """),format.raw/*11.13*/("""<fieldset>

                """),_display_(/*13.18*/inputDate(subscriptionForm("date"), '_label -> "Date of renewal")),format.raw/*13.83*/("""
                """),_display_(/*14.18*/inputText(subscriptionForm("cost"), '_label -> "Cost of renewal")),format.raw/*14.83*/("""
                """),_display_(/*15.18*/inputText(subscriptionForm("name"), '_label -> "Name of subscription")),format.raw/*15.88*/("""
                """),_display_(/*16.18*/inputText(subscriptionForm("frequency"), '_label -> "Frequency of renewal")),format.raw/*16.93*/("""

                """),_display_(/*18.18*/select(
                    subscriptionForm("category"),
                    Seq(
                        "entertainment" -> "Entertainment",
                        "education" -> "Education",
                        "business" -> "Business",
                        "health" -> "Health"
                    ),
                    '_label -> "Category",
                    '_default -> "-- Choose a category --",
                    '_showConstraints -> false
                )),format.raw/*29.18*/("""

            """),format.raw/*31.13*/("""</fieldset>

            <div class="actions">
                <input type="submit" value="Save this subscription" class="btn primary"> or
                <a href=""""),_display_(/*35.27*/routes/*35.33*/.Application.list()),format.raw/*35.52*/("""" class="btn">Cancel</a>
            </div>

        """)))}),format.raw/*38.10*/("""

        """),_display_(/*40.10*/form(routes.Application.delete(id), 'class -> "topRight")/*40.67*/ {_display_(Seq[Any](format.raw/*40.69*/("""
            """),format.raw/*41.13*/("""<input type="submit" value="Delete this subscription" class="btn danger">
        """)))}),format.raw/*42.10*/("""

    """)))}))
      }
    }
  }

  def render(id:Long,subscriptionForm:Form[Subscription],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(id,subscriptionForm)(messages)

  def f:((Long,Form[Subscription]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (id,subscriptionForm) => (messages) => apply(id,subscriptionForm)(messages)

  def ref: this.type = this

}


}

/**/
object editForm extends editForm_Scope0.editForm
              /*
                  -- GENERATED --
                  DATE: Fri Jun 10 09:49:27 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/editForm.scala.html
                  HASH: bdcb48e455be52ddcbab3668587bf33b977c29ed
                  MATRIX: 559->1|746->78|778->101|809->107|823->113|862->115|898->125|961->162|1004->197|1043->199|1085->213|1141->242|1227->307|1272->325|1358->390|1403->408|1494->478|1539->496|1635->571|1681->590|2182->1070|2224->1084|2416->1249|2431->1255|2471->1274|2556->1328|2594->1339|2660->1396|2700->1398|2741->1411|2855->1494
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|30->7|32->9|32->9|32->9|34->11|36->13|36->13|37->14|37->14|38->15|38->15|39->16|39->16|41->18|52->29|54->31|58->35|58->35|58->35|61->38|63->40|63->40|63->40|64->41|65->42
                  -- GENERATED --
              */
          