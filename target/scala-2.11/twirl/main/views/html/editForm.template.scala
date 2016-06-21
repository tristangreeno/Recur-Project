
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

                """),format.raw/*16.17*/("""<select name='name' type='text' id='autocomplete' style="min-width: 50%">
                </select>

                """),_display_(/*19.18*/select(
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
                )),format.raw/*33.18*/("""

                """),_display_(/*35.18*/select(
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
                )),format.raw/*46.18*/("""

                """),_display_(/*48.18*/select(
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
                )),format.raw/*62.18*/("""
                """),_display_(/*63.18*/select(
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
                )),format.raw/*74.18*/("""

            """),format.raw/*76.13*/("""</fieldset>

            <div class="actions">
                <input type="submit" value="Save this subscription" class="btn primary"> or
                <a href=""""),_display_(/*80.27*/routes/*80.33*/.Application.list()),format.raw/*80.52*/("""" class="btn">Cancel</a>
            </div>

        """)))}),format.raw/*83.10*/("""

        """),_display_(/*85.10*/form(routes.Application.delete(id), 'class -> "topRight")/*85.67*/ {_display_(Seq[Any](format.raw/*85.69*/("""
            """),format.raw/*86.13*/("""<input type="submit" value="Delete this subscription" class="btn danger">
        """)))}),format.raw/*87.10*/("""

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
                  DATE: Tue Jun 21 14:28:56 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/editForm.scala.html
                  HASH: ecd9c152a9053a46627bd0d19b3166b80473bcb9
                  MATRIX: 559->1|746->78|778->101|809->107|823->113|862->115|898->125|961->162|1004->197|1043->199|1085->213|1141->242|1227->307|1272->325|1381->412|1427->430|1572->548|2212->1167|2258->1186|2759->1666|2805->1685|3445->2304|3490->2322|3991->2802|4033->2816|4225->2981|4240->2987|4280->3006|4365->3060|4403->3071|4469->3128|4509->3130|4550->3143|4664->3226
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|30->7|32->9|32->9|32->9|34->11|36->13|36->13|37->14|37->14|39->16|42->19|56->33|58->35|69->46|71->48|85->62|86->63|97->74|99->76|103->80|103->80|103->80|106->83|108->85|108->85|108->85|109->86|110->87
                  -- GENERATED --
              */
          