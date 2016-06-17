
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

                """),format.raw/*16.17*/("""<select class="js-data-example-ajax" name="name">
                    <script>
                            $(".js-data-example-ajax").select2("""),format.raw/*18.64*/("""{"""),format.raw/*18.65*/("""
                                """),format.raw/*19.33*/("""ajax: """),format.raw/*19.39*/("""{"""),format.raw/*19.40*/("""
                                    """),format.raw/*20.37*/("""url: 'https://glacial-brook-71360.herokuapp.com/companies/' + params.term,
                                    dataType: 'json',
                                    delay: 250,
                                    data: function (params) """),format.raw/*23.61*/("""{"""),format.raw/*23.62*/("""
                                        """),format.raw/*24.41*/("""return """),format.raw/*24.48*/("""{"""),format.raw/*24.49*/("""
                                            """),format.raw/*25.45*/("""q: params.term, // search term
                                            page: params.page
                                        """),format.raw/*27.41*/("""}"""),format.raw/*27.42*/(""";
                                    """),format.raw/*28.37*/("""}"""),format.raw/*28.38*/(""",
                                    processResults: function (data, params) """),format.raw/*29.77*/("""{"""),format.raw/*29.78*/("""
                                        """),format.raw/*30.41*/("""// parse the results into the format expected by Select2
                                        // since we are using custom formatting functions we do not need to
                                        // alter the remote JSON data, except to indicate that infinite
                                        // scrolling can be used
                                        params.page = params.page || 1;

                                        return """),format.raw/*36.48*/("""{"""),format.raw/*36.49*/("""
                                            """),format.raw/*37.45*/("""results: data.items,
                                            pagination: """),format.raw/*38.57*/("""{"""),format.raw/*38.58*/("""
                                                """),format.raw/*39.49*/("""more: (params.page * 30) < data.total_count
                                            """),format.raw/*40.45*/("""}"""),format.raw/*40.46*/("""
                                        """),format.raw/*41.41*/("""}"""),format.raw/*41.42*/(""";
                                    """),format.raw/*42.37*/("""}"""),format.raw/*42.38*/(""",
                                    cache: true
                                """),format.raw/*44.33*/("""}"""),format.raw/*44.34*/(""",
                                escapeMarkup: function (markup) """),format.raw/*45.65*/("""{"""),format.raw/*45.66*/(""" """),format.raw/*45.67*/("""return markup; """),format.raw/*45.82*/("""}"""),format.raw/*45.83*/(""", // let our custom formatter work
                                minimumInputLength: 1,
                                templateResult: formatRepo, // omitted for brevity, see the source of this page
                                templateSelection: formatRepoSelection // omitted for brevity, see the source of this page
                            """),format.raw/*49.29*/("""}"""),format.raw/*49.30*/(""");
                    </script>
                </select>

                """),_display_(/*53.18*/select(
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
                )),format.raw/*67.18*/("""
                """),_display_(/*68.18*/select(
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
                )),format.raw/*79.18*/("""

            """),format.raw/*81.13*/("""</fieldset>

            <div class="actions">
                <input type="submit" value="Save this subscription" class="btn primary"> or
                <a href=""""),_display_(/*85.27*/routes/*85.33*/.Application.list()),format.raw/*85.52*/("""" class="btn">Cancel</a>
            </div>

        """)))}),format.raw/*88.10*/("""

        """),_display_(/*90.10*/form(routes.Application.delete(id), 'class -> "topRight")/*90.67*/ {_display_(Seq[Any](format.raw/*90.69*/("""
            """),format.raw/*91.13*/("""<input type="submit" value="Delete this subscription" class="btn danger">
        """)))}),format.raw/*92.10*/("""

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
                  DATE: Fri Jun 17 15:27:33 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/editForm.scala.html
                  HASH: c6735527bed83d4aacfeec043e1b928890e1fb8b
                  MATRIX: 559->1|746->78|778->101|809->107|823->113|862->115|898->125|961->162|1004->197|1043->199|1085->213|1141->242|1227->307|1272->325|1381->412|1427->430|1597->572|1626->573|1687->606|1721->612|1750->613|1815->650|2080->887|2109->888|2178->929|2213->936|2242->937|2315->982|2476->1115|2505->1116|2571->1154|2600->1155|2706->1233|2735->1234|2804->1275|3286->1729|3315->1730|3388->1775|3493->1852|3522->1853|3599->1902|3715->1990|3744->1991|3813->2032|3842->2033|3908->2071|3937->2072|4047->2154|4076->2155|4170->2221|4199->2222|4228->2223|4271->2238|4300->2239|4681->2592|4710->2593|4814->2670|5454->3289|5499->3307|6000->3787|6042->3801|6234->3966|6249->3972|6289->3991|6374->4045|6412->4056|6478->4113|6518->4115|6559->4128|6673->4211
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|30->7|32->9|32->9|32->9|34->11|36->13|36->13|37->14|37->14|39->16|41->18|41->18|42->19|42->19|42->19|43->20|46->23|46->23|47->24|47->24|47->24|48->25|50->27|50->27|51->28|51->28|52->29|52->29|53->30|59->36|59->36|60->37|61->38|61->38|62->39|63->40|63->40|64->41|64->41|65->42|65->42|67->44|67->44|68->45|68->45|68->45|68->45|68->45|72->49|72->49|76->53|90->67|91->68|102->79|104->81|108->85|108->85|108->85|111->88|113->90|113->90|113->90|114->91|115->92
                  -- GENERATED --
              */
          