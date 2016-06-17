
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
                """),_display_(/*14.18*/inputText(subscriptionForm("cost"), '_label -> "Cost of renewal (Must be an integer!)")),format.raw/*14.105*/("""
                """),_display_(/*15.18*/inputText(subscriptionForm("name"), '_label -> "Name of subscription")),format.raw/*15.88*/("""
                """),_display_(/*16.18*/select(
                    subscriptionForm("frequency"),
                    Seq(
                        "7" -> "Every week",
                        "14" -> "Every two weeks",
                        "30" -> "Once a month",
                        "90" -> "Every 3 months",
                        "180" -> "Every 6 months",
                        "365" -> "Every year",
                        "730" -> "Every two years"
                    ),
                    '_label -> "Frequency",
                    '_default -> "-- Choose a frequency --",
                    '_showConstraints -> false
                )),format.raw/*30.18*/("""
                """),_display_(/*31.18*/select(
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
                )),format.raw/*42.18*/("""

            """),format.raw/*44.13*/("""</fieldset>

            <div class="actions">
                <input type="submit" value="Save this subscription" class="btn primary"> or
                <a href=""""),_display_(/*48.27*/routes/*48.33*/.Application.list()),format.raw/*48.52*/("""" class="btn">Cancel</a>
            </div>

        """)))}),format.raw/*51.10*/("""

        """),_display_(/*53.10*/form(routes.Application.delete(id), 'class -> "topRight")/*53.67*/ {_display_(Seq[Any](format.raw/*53.69*/("""
            """),format.raw/*54.13*/("""<input type="submit" value="Delete this subscription" class="btn danger">
        """)))}),format.raw/*55.10*/("""

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
                  DATE: Fri Jun 17 12:18:06 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/editForm.scala.html
                  HASH: ac1e7246465c26e46a35a7caecfcfba9a4efca12
                  MATRIX: 559->1|746->78|778->101|809->107|823->113|862->115|898->125|961->162|1004->197|1043->199|1085->213|1141->242|1227->307|1272->325|1381->412|1426->430|1517->500|1562->518|2202->1137|2247->1155|2748->1635|2790->1649|2982->1814|2997->1820|3037->1839|3122->1893|3160->1904|3226->1961|3266->1963|3307->1976|3421->2059
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|30->7|32->9|32->9|32->9|34->11|36->13|36->13|37->14|37->14|38->15|38->15|39->16|53->30|54->31|65->42|67->44|71->48|71->48|71->48|74->51|76->53|76->53|76->53|77->54|78->55
                  -- GENERATED --
              */
          