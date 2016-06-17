
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

            """),format.raw/*16.13*/("""<select class="js-data-example-ajax">
                <script>
                $(".js-data-example-ajax").select2("""),format.raw/*18.52*/("""{"""),format.raw/*18.53*/("""
                """),format.raw/*19.17*/("""ajax: """),format.raw/*19.23*/("""{"""),format.raw/*19.24*/("""
                """),format.raw/*20.17*/("""url: 'https://glacial-brook-71360.herokuapp.com/companies/' + params.term,
                dataType: 'json',
                delay: 250,
                data: function (params) """),format.raw/*23.41*/("""{"""),format.raw/*23.42*/("""
                """),format.raw/*24.17*/("""return """),format.raw/*24.24*/("""{"""),format.raw/*24.25*/("""
                """),format.raw/*25.17*/("""q: params.term, // search term
                page: params.page
                """),format.raw/*27.17*/("""}"""),format.raw/*27.18*/(""";
                """),format.raw/*28.17*/("""}"""),format.raw/*28.18*/(""",
                processResults: function (data, params) """),format.raw/*29.57*/("""{"""),format.raw/*29.58*/("""
                """),format.raw/*30.17*/("""// parse the results into the format expected by Select2
                // since we are using custom formatting functions we do not need to
                // alter the remote JSON data, except to indicate that infinite
                // scrolling can be used
                params.page = params.page || 1;

                return """),format.raw/*36.24*/("""{"""),format.raw/*36.25*/("""
                """),format.raw/*37.17*/("""results: data.items,
                pagination: """),format.raw/*38.29*/("""{"""),format.raw/*38.30*/("""
                """),format.raw/*39.17*/("""more: (params.page * 30) < data.total_count
                """),format.raw/*40.17*/("""}"""),format.raw/*40.18*/("""
                """),format.raw/*41.17*/("""}"""),format.raw/*41.18*/(""";
                """),format.raw/*42.17*/("""}"""),format.raw/*42.18*/(""",
                cache: true
                """),format.raw/*44.17*/("""}"""),format.raw/*44.18*/(""",
                escapeMarkup: function (markup) """),format.raw/*45.49*/("""{"""),format.raw/*45.50*/(""" """),format.raw/*45.51*/("""return markup; """),format.raw/*45.66*/("""}"""),format.raw/*45.67*/(""", // let our custom formatter work
                minimumInputLength: 1,
                templateResult: formatRepo, // omitted for brevity, see the source of this page
                templateSelection: formatRepoSelection // omitted for brevity, see the source of this page
                """),format.raw/*49.17*/("""}"""),format.raw/*49.18*/(""");
                </script>
            </select>

            """),_display_(/*53.14*/select(
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
            )),format.raw/*67.14*/("""

            """),_display_(/*69.14*/select(
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
            )),format.raw/*80.14*/("""

            """),format.raw/*82.13*/("""<input type="hidden" name="userId" value=""""),_display_(/*82.56*/user/*82.60*/.id),format.raw/*82.63*/("""" />

        </fieldset>



        <div class="actions">
            <input type="submit" value="Create this subscription" class="btn primary"/> or
            <a href=""""),_display_(/*90.23*/routes/*90.29*/.Application.list()),format.raw/*90.48*/("""" class="btn">Cancel</a>
        </div>
    """)))}),format.raw/*92.6*/("""
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
                  DATE: Fri Jun 17 15:20:00 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/createForm.scala.html
                  HASH: 2b7b05b16535957204491a529071a53f005507e9
                  MATRIX: 628->36|802->115|830->118|843->124|882->126|914->132|976->168|1027->210|1067->212|1103->221|1155->246|1241->311|1282->325|1391->412|1433->426|1575->540|1604->541|1649->558|1683->564|1712->565|1757->582|1962->759|1991->760|2036->777|2071->784|2100->785|2145->802|2254->883|2283->884|2329->902|2358->903|2444->961|2473->962|2518->979|2880->1313|2909->1314|2954->1331|3031->1380|3060->1381|3105->1398|3193->1458|3222->1459|3267->1476|3296->1477|3342->1495|3371->1496|3445->1542|3474->1543|3552->1593|3581->1594|3610->1595|3653->1610|3682->1611|4003->1904|4032->1905|4124->1970|4708->2533|4750->2548|5207->2984|5249->2998|5319->3041|5332->3045|5356->3048|5555->3220|5570->3226|5610->3245|5685->3290
                  LINES: 24->4|29->4|31->6|31->6|31->6|33->8|35->10|35->10|35->10|36->11|38->13|38->13|39->14|39->14|41->16|43->18|43->18|44->19|44->19|44->19|45->20|48->23|48->23|49->24|49->24|49->24|50->25|52->27|52->27|53->28|53->28|54->29|54->29|55->30|61->36|61->36|62->37|63->38|63->38|64->39|65->40|65->40|66->41|66->41|67->42|67->42|69->44|69->44|70->45|70->45|70->45|70->45|70->45|74->49|74->49|78->53|92->67|94->69|105->80|107->82|107->82|107->82|107->82|115->90|115->90|115->90|117->92
                  -- GENERATED --
              */
          