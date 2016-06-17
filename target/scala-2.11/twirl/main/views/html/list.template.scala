
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
  def apply/*1.2*/ (impendingSubscriptionsList: SubscriptionList[Subscription], allSubscriptionsList: SubscriptionList[Subscription])(implicit flash: play.api.mvc.Flash = play.api.mvc.Flash.emptyCookie, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/header/*3.8*/(title: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.27*/("""
        """),format.raw/*4.9*/("""<b>"""),_display_(/*4.13*/title),format.raw/*4.18*/("""</b>
""")))};
Seq[Any](format.raw/*1.205*/("""

"""),format.raw/*5.2*/("""

"""),_display_(/*7.2*/noUser/*7.8*/ {_display_(Seq[Any](format.raw/*7.10*/("""
    """),format.raw/*8.5*/("""<img src=""""),_display_(/*8.16*/routes/*8.22*/.Assets.versioned("images/Recur300x300a.png")),format.raw/*8.67*/(""""/>
    <h1>"""),_display_(/*9.10*/Messages("Recur - Subscriptions Database")),format.raw/*9.52*/("""</h1>

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

  def render(impendingSubscriptionsList:SubscriptionList[Subscription], allSubscriptionsList:SubscriptionList[Subscription], flash:play.api.mvc.Flash, messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(impendingSubscriptionsList,allSubscriptionsList)(flash,messages)

  def f:((SubscriptionList[Subscription],SubscriptionList[Subscription]) => (play.api.mvc.Flash,Messages) => play.twirl.api.HtmlFormat.Appendable) = (impendingSubscriptionsList, allSubscriptionsList) => (flash, messages) => apply(impendingSubscriptionsList,allSubscriptionsList)(flash,messages)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Thu Jun 16 18:16:17 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/list.scala.html
                  HASH: 71e7ce27edadde82d5f7463afa44796b6155f272
                  MATRIX: 608->1|889->207|902->213|997->232|1032->241|1062->245|1087->250|1133->204|1161->256|1189->259|1202->265|1241->267|1272->272|1309->283|1323->289|1388->334|1427->347|1489->389|1527->401|1541->406|1569->425|1620->438|1656->447|1755->519|1783->526|1819->535|1861->547|1894->553|1988->620|2003->626|2045->647|2118->694|2167->734|2201->759|2258->778|2294->787|2466->932|2501->946|2554->972|2600->997|2653->1023|2699->1048|2752->1074|2792->1093|2845->1119|2884->1137|2933->1158|3032->1230|3054->1243|3067->1247|3078->1270|3109->1292|3149->1294|3202->1319|3276->1366|3291->1372|3350->1410|3380->1413|3402->1425|3429->1430|3500->1474|3521->1486|3547->1491|3614->1531|3635->1543|3661->1548|3728->1588|3749->1600|3780->1610|3847->1650|3868->1662|3898->1671|3965->1724|4018->1749|4120->1821|4153->1828|4196->1862|4230->1887|4287->1906|4319->1911|4474->2039|4509->2053|4554->2071|4600->2096|4645->2114|4691->2139|4736->2157|4776->2176|4821->2194|4860->2212|4901->2225|4977->2274|4999->2287|5012->2291|5023->2306|5054->2328|5094->2330|5139->2347|5205->2386|5220->2392|5279->2430|5309->2433|5330->2445|5356->2450|5419->2486|5440->2498|5466->2503|5525->2535|5546->2547|5572->2552|5631->2584|5652->2596|5683->2606|5742->2638|5763->2650|5793->2659|5866->2710|5903->2720|5962->2761|5981->2771|6021->2773|6058->2783|6168->2863|6200->2865
                  LINES: 20->1|24->3|24->3|26->3|27->4|27->4|27->4|29->1|31->5|33->7|33->7|33->7|34->8|34->8|34->8|34->8|35->9|35->9|37->11|37->11|37->11|37->11|38->12|39->13|39->13|40->14|41->15|43->17|45->19|45->19|45->19|49->23|49->23|49->23|49->23|50->24|55->29|55->29|56->30|56->30|57->31|57->31|58->32|58->32|59->33|59->33|60->34|63->37|63->37|63->37|63->38|63->38|63->38|64->39|65->40|65->40|65->40|65->40|65->40|65->40|66->41|66->41|66->41|67->42|67->42|67->42|68->43|68->43|68->43|69->44|69->44|69->44|70->46|71->47|75->51|77->53|77->53|77->53|77->53|78->54|83->59|83->59|84->60|84->60|85->61|85->61|86->62|86->62|87->63|87->63|88->64|92->68|92->68|92->68|92->69|92->69|92->69|93->70|94->71|94->71|94->71|94->71|94->71|94->71|95->72|95->72|95->72|96->73|96->73|96->73|97->74|97->74|97->74|98->75|98->75|98->75|100->78|102->80|107->85|107->85|107->85|109->87|113->91|114->92
                  -- GENERATED --
              */
          