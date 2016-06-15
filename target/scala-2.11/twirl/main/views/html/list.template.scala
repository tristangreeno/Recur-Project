
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object list_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[SubscriptionList[Subscription],SubscriptionList[Subscription],play.api.mvc.Flash,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(impendingSubscriptionsList: SubscriptionList[Subscription], allSubscriptionsList: SubscriptionList[Subscription])(implicit flash: play.api.mvc.Flash = play.api.mvc.Flash.emptyCookie, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/header/*3.8*/(title: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.27*/("""
        """),format.raw/*4.9*/("""<b>"""),_display_(/*4.13*/title),format.raw/*4.18*/("""</b>
""")))};
Seq[Any](format.raw/*1.205*/("""

"""),format.raw/*5.2*/("""

"""),_display_(/*7.2*/noUser/*7.8*/ {_display_(Seq[Any](format.raw/*7.10*/("""

    """),format.raw/*9.5*/("""<h1>"""),_display_(/*9.10*/Messages("Recur - Subscriptions Database")),format.raw/*9.52*/("""</h1>

    """),_display_(/*11.6*/flash/*11.11*/.get("success").map/*11.30*/ { message =>_display_(Seq[Any](format.raw/*11.43*/("""
        """),format.raw/*12.9*/("""<div class="alert-message warning">
            <strong>Done!</strong> """),_display_(/*13.37*/message),format.raw/*13.44*/("""
        """),format.raw/*14.9*/("""</div>
    """)))}),format.raw/*15.6*/("""

    """),format.raw/*17.5*/("""<div id="actions">

        <a class="btn success" id="add" href=""""),_display_(/*19.48*/routes/*19.54*/.Application.create()),format.raw/*19.75*/("""">Add a new subscription</a>

    </div>

    """),_display_(/*23.6*/Option(impendingSubscriptionsList.items)/*23.46*/.filterNot(_.isEmpty).map/*23.71*/ { subscriptions =>_display_(Seq[Any](format.raw/*23.90*/("""
        """),format.raw/*24.9*/("""<div>
            <h3>Impending Subscriptions</h3>
            <table>
                <thead>
                    <tr>
                        """),_display_(/*29.26*/header("Name")),format.raw/*29.40*/("""
                        """),_display_(/*30.26*/header("Cost of renewal")),format.raw/*30.51*/("""
                        """),_display_(/*31.26*/header("Date of renewal")),format.raw/*31.51*/("""
                        """),_display_(/*32.26*/header("Frequency")),format.raw/*32.45*/("""
                        """),_display_(/*33.26*/header("Category")),format.raw/*33.44*/("""
                    """),format.raw/*34.21*/("""</tr>
                </thead>
                <tbody>
                """),_display_(/*37.18*/subscriptions/*37.31*/.map/*37.35*/ {/*38.21*/case (subscription) =>/*38.43*/ {_display_(Seq[Any](format.raw/*38.45*/("""
                        """),format.raw/*39.25*/("""<tr>
                            <td><a href=""""),_display_(/*40.43*/routes/*40.49*/.Application.edit(subscription.id.get)),format.raw/*40.87*/("""">"""),_display_(/*40.90*/subscription/*40.102*/.name),format.raw/*40.107*/("""</a></td>
                            <td> """),_display_(/*41.35*/subscription/*41.47*/.date),format.raw/*41.52*/("""</td>
                            <td> """),_display_(/*42.35*/subscription/*42.47*/.cost),format.raw/*42.52*/("""</td>
                            <td> """),_display_(/*43.35*/subscription/*43.47*/.frequency),format.raw/*43.57*/("""</td>
                            <td> """),_display_(/*44.35*/subscription/*44.47*/.category),format.raw/*44.56*/("""</td>
                            """)))}}),format.raw/*46.18*/("""
                        """),format.raw/*47.25*/("""</tr>
                </tbody>
            </table>
        </div>
    """)))}),format.raw/*51.6*/("""

    """),_display_(/*53.6*/Option(allSubscriptionsList.items)/*53.40*/.filterNot(_.isEmpty).map/*53.65*/ { subscriptions =>_display_(Seq[Any](format.raw/*53.84*/("""
    """),format.raw/*54.5*/("""<div> <!-- for scroll bar -->
        <h3>All Subscriptions</h3>
     <table>
        <thead>
            <tr>
                """),_display_(/*59.18*/header("Name")),format.raw/*59.32*/("""
                """),_display_(/*60.18*/header("Cost of renewal")),format.raw/*60.43*/("""
                """),_display_(/*61.18*/header("Date of renewal")),format.raw/*61.43*/("""
                """),_display_(/*62.18*/header("Frequency")),format.raw/*62.37*/("""
                """),_display_(/*63.18*/header("Category")),format.raw/*63.36*/("""
            """),format.raw/*64.13*/("""</tr>
        </thead>
        <tbody>

        """),_display_(/*68.10*/subscriptions/*68.23*/.map/*68.27*/ {/*69.13*/case (subscription) =>/*69.35*/ {_display_(Seq[Any](format.raw/*69.37*/("""
                """),format.raw/*70.17*/("""<tr>
                    <td><a href=""""),_display_(/*71.35*/routes/*71.41*/.Application.edit(subscription.id.get)),format.raw/*71.79*/("""">"""),_display_(/*71.82*/subscription/*71.94*/.name),format.raw/*71.99*/("""</a></td>
                    <td> """),_display_(/*72.27*/subscription/*72.39*/.date),format.raw/*72.44*/("""</td>
                    <td> """),_display_(/*73.27*/subscription/*73.39*/.cost),format.raw/*73.44*/("""</td>
                    <td> """),_display_(/*74.27*/subscription/*74.39*/.frequency),format.raw/*74.49*/("""</td>
                    <td> """),_display_(/*75.27*/subscription/*75.39*/.category),format.raw/*75.48*/("""</td>
                </tr>
            """)))}}),format.raw/*78.10*/("""

        """),format.raw/*80.9*/("""</tbody>
     </table>
    </div>


    """)))}/*85.6*/.getOrElse/*85.16*/ {_display_(Seq[Any](format.raw/*85.18*/("""

        """),format.raw/*87.9*/("""<div class="well">
            <em>Nothing to display</em>
        </div>

    """)))}),format.raw/*91.6*/("""
""")))}),format.raw/*92.2*/("""




"""))
      }
    }
  }

  def render(impendingSubscriptionsList:SubscriptionList[Subscription],allSubscriptionsList:SubscriptionList[Subscription],flash:play.api.mvc.Flash,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(impendingSubscriptionsList,allSubscriptionsList)(flash,messages)

  def f:((SubscriptionList[Subscription],SubscriptionList[Subscription]) => (play.api.mvc.Flash,Messages) => play.twirl.api.HtmlFormat.Appendable) = (impendingSubscriptionsList,allSubscriptionsList) => (flash,messages) => apply(impendingSubscriptionsList,allSubscriptionsList)(flash,messages)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Wed Jun 15 15:27:47 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/list.scala.html
                  HASH: 363f935a29cc6675cad3a9239bb2976cf0f550ed
                  MATRIX: 608->1|889->207|902->213|997->232|1032->241|1062->245|1087->250|1133->204|1161->256|1189->259|1202->265|1241->267|1273->273|1304->278|1366->320|1404->332|1418->337|1446->356|1497->369|1533->378|1632->450|1660->457|1696->466|1738->478|1771->484|1865->551|1880->557|1922->578|1995->625|2044->665|2078->690|2135->709|2171->718|2343->863|2378->877|2431->903|2477->928|2530->954|2576->979|2629->1005|2669->1024|2722->1050|2761->1068|2810->1089|2909->1161|2931->1174|2944->1178|2955->1201|2986->1223|3026->1225|3079->1250|3153->1297|3168->1303|3227->1341|3257->1344|3279->1356|3306->1361|3377->1405|3398->1417|3424->1422|3491->1462|3512->1474|3538->1479|3605->1519|3626->1531|3657->1541|3724->1581|3745->1593|3775->1602|3842->1655|3895->1680|3997->1752|4030->1759|4073->1793|4107->1818|4164->1837|4196->1842|4351->1970|4386->1984|4431->2002|4477->2027|4522->2045|4568->2070|4613->2088|4653->2107|4698->2125|4737->2143|4778->2156|4854->2205|4876->2218|4889->2222|4900->2237|4931->2259|4971->2261|5016->2278|5082->2317|5097->2323|5156->2361|5186->2364|5207->2376|5233->2381|5296->2417|5317->2429|5343->2434|5402->2466|5423->2478|5449->2483|5508->2515|5529->2527|5560->2537|5619->2569|5640->2581|5670->2590|5743->2641|5780->2651|5839->2692|5858->2702|5898->2704|5935->2714|6045->2794|6077->2796
                  LINES: 20->1|24->3|24->3|26->3|27->4|27->4|27->4|29->1|31->5|33->7|33->7|33->7|35->9|35->9|35->9|37->11|37->11|37->11|37->11|38->12|39->13|39->13|40->14|41->15|43->17|45->19|45->19|45->19|49->23|49->23|49->23|49->23|50->24|55->29|55->29|56->30|56->30|57->31|57->31|58->32|58->32|59->33|59->33|60->34|63->37|63->37|63->37|63->38|63->38|63->38|64->39|65->40|65->40|65->40|65->40|65->40|65->40|66->41|66->41|66->41|67->42|67->42|67->42|68->43|68->43|68->43|69->44|69->44|69->44|70->46|71->47|75->51|77->53|77->53|77->53|77->53|78->54|83->59|83->59|84->60|84->60|85->61|85->61|86->62|86->62|87->63|87->63|88->64|92->68|92->68|92->68|92->69|92->69|92->69|93->70|94->71|94->71|94->71|94->71|94->71|94->71|95->72|95->72|95->72|96->73|96->73|96->73|97->74|97->74|97->74|98->75|98->75|98->75|100->78|102->80|107->85|107->85|107->85|109->87|113->91|114->92
                  -- GENERATED --
              */
          