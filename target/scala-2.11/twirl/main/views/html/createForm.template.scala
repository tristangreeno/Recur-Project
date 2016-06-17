
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
            """),_display_(/*14.14*/inputText(subscriptionForm("cost"), '_label -> "Cost of renewal (Must be an integer!)")),format.raw/*14.101*/("""
            """),_display_(/*15.14*/inputText(subscriptionForm("name"), '_label -> "Company name")),format.raw/*15.76*/("""

            """),_display_(/*17.14*/select(
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
            )),format.raw/*31.14*/("""

            """),_display_(/*33.14*/select(
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
            )),format.raw/*44.14*/("""

            """),format.raw/*46.13*/("""<input type="hidden" name="userId" value=""""),_display_(/*46.56*/user/*46.60*/.id),format.raw/*46.63*/("""" />

        </fieldset>



        <div class="actions">
            <input type="submit" value="Create this subscription" class="btn primary"/> or
            <a href=""""),_display_(/*54.23*/routes/*54.29*/.Application.list()),format.raw/*54.48*/("""" class="btn">Cancel</a>
        </div>
    """)))}),format.raw/*56.6*/("""
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
                  DATE: Fri Jun 17 12:18:06 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/createForm.scala.html
                  HASH: 9811e5cdefacd97700abc47388f06b16dce01a78
                  MATRIX: 628->36|802->115|830->118|843->124|882->126|914->132|976->168|1027->210|1067->212|1103->221|1155->246|1241->311|1282->325|1391->412|1432->426|1515->488|1557->503|2141->1066|2183->1081|2640->1517|2682->1531|2752->1574|2765->1578|2789->1581|2988->1753|3003->1759|3043->1778|3118->1823
                  LINES: 24->4|29->4|31->6|31->6|31->6|33->8|35->10|35->10|35->10|36->11|38->13|38->13|39->14|39->14|40->15|40->15|42->17|56->31|58->33|69->44|71->46|71->46|71->46|71->46|79->54|79->54|79->54|81->56
                  -- GENERATED --
              */
          