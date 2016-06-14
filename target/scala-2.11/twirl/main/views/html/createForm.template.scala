
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object createForm_Scope1 {
import helper._
import models._

class createForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Subscription],User,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(subscriptionForm: Form[Subscription], user: User)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.81*/("""

"""),_display_(/*6.2*/noUser/*6.8*/ {_display_(Seq[Any](format.raw/*6.10*/("""

    """),format.raw/*8.5*/("""<h1> Add a subscription </h1>

    """),_display_(/*10.6*/form(routes.Application.save(user.userId))/*10.48*/ {_display_(Seq[Any](format.raw/*10.50*/("""
        """),format.raw/*11.9*/("""<fieldset>

            """),_display_(/*13.14*/inputDate(subscriptionForm("date"), '_label -> "Date of renewal")),format.raw/*13.79*/("""
            """),_display_(/*14.14*/inputText(subscriptionForm("cost"), '_label -> "Cost of renewal")),format.raw/*14.79*/("""
            """),_display_(/*15.14*/inputText(subscriptionForm("name"), '_label -> "Name of subscription")),format.raw/*15.84*/("""
            """),_display_(/*16.14*/inputText(subscriptionForm("frequency"), '_label -> "Frequency of renewal")),format.raw/*16.89*/("""

            """),_display_(/*18.14*/select(
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
            )),format.raw/*29.14*/("""

            """),format.raw/*31.13*/("""<input type="hidden" name="userId" value=""""),_display_(/*31.56*/user/*31.60*/.id),format.raw/*31.63*/("""" />

        </fieldset>



        <div class="actions">
            <input type="submit" value="Create this subscription" class="btn primary"/> or
            <a href=""""),_display_(/*39.23*/routes/*39.29*/.Application.list()),format.raw/*39.48*/("""" class="btn">Cancel</a>
        </div>
    """)))}),format.raw/*41.6*/("""
""")))}))
      }
    }
  }

  def render(subscriptionForm:Form[Subscription],user:User,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(subscriptionForm,user)(messages)

  def f:((Form[Subscription],User) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (subscriptionForm,user) => (messages) => apply(subscriptionForm,user)(messages)

  def ref: this.type = this

}


}
}

/**/
object createForm extends createForm_Scope0.createForm_Scope1.createForm
              /*
                  -- GENERATED --
                  DATE: Fri Jun 10 12:06:01 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/createForm.scala.html
                  HASH: f5fdb0a3188d58127b3b1115cc5f74110a5246de
                  MATRIX: 628->36|802->115|830->118|843->124|882->126|914->132|976->168|1027->210|1067->212|1103->221|1155->246|1241->311|1282->325|1368->390|1409->404|1500->474|1541->488|1637->563|1679->578|2136->1014|2178->1028|2248->1071|2261->1075|2285->1078|2484->1250|2499->1256|2539->1275|2614->1320
                  LINES: 24->4|29->4|31->6|31->6|31->6|33->8|35->10|35->10|35->10|36->11|38->13|38->13|39->14|39->14|40->15|40->15|41->16|41->16|43->18|54->29|56->31|56->31|56->31|56->31|64->39|64->39|64->39|66->41
                  -- GENERATED --
              */
          