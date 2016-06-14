
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
    """),format.raw/*8.5*/("""<h1>"""),_display_(/*8.10*/Messages("Recur - Subscriptions Database")),format.raw/*8.52*/("""</h1>

    """),_display_(/*10.6*/flash/*10.11*/.get("success").map/*10.30*/ { message =>_display_(Seq[Any](format.raw/*10.43*/("""
        """),format.raw/*11.9*/("""<div class="alert-message warning">
            <strong>Done!</strong> """),_display_(/*12.37*/message),format.raw/*12.44*/("""
        """),format.raw/*13.9*/("""</div>
    """)))}),format.raw/*14.6*/("""

    """),format.raw/*16.5*/("""<div id="actions">

        <a class="btn success" id="add" href=""""),_display_(/*18.48*/routes/*18.54*/.Application.create()),format.raw/*18.75*/("""">Add a new subscription</a>

    </div>

    """),_display_(/*22.6*/Option(impendingSubscriptionsList.items)/*22.46*/.filterNot(_.isEmpty).map/*22.71*/ { subscriptions =>_display_(Seq[Any](format.raw/*22.90*/("""
        """),format.raw/*23.9*/("""<div>
            <h3>Impending Subscriptions</h3>
            <table>
                <thead>
                    <tr>
                        """),_display_(/*28.26*/header("Name")),format.raw/*28.40*/("""
                        """),_display_(/*29.26*/header("Cost of renewal")),format.raw/*29.51*/("""
                        """),_display_(/*30.26*/header("Date of renewal")),format.raw/*30.51*/("""
                        """),_display_(/*31.26*/header("Frequency")),format.raw/*31.45*/("""
                        """),_display_(/*32.26*/header("Category")),format.raw/*32.44*/("""
                    """),format.raw/*33.21*/("""</tr>
                </thead>
                <tbody>
                """),_display_(/*36.18*/subscriptions/*36.31*/.map/*36.35*/ {/*37.21*/case (subscription) =>/*37.43*/ {_display_(Seq[Any](format.raw/*37.45*/("""
                        """),format.raw/*38.25*/("""<tr>
                            <td><a href=""""),_display_(/*39.43*/routes/*39.49*/.Application.edit(subscription.id.get)),format.raw/*39.87*/("""">"""),_display_(/*39.90*/subscription/*39.102*/.name),format.raw/*39.107*/("""</a></td>
                            <td> """),_display_(/*40.35*/subscription/*40.47*/.date),format.raw/*40.52*/("""</td>
                            <td> """),_display_(/*41.35*/subscription/*41.47*/.cost),format.raw/*41.52*/("""</td>
                            <td> """),_display_(/*42.35*/subscription/*42.47*/.frequency),format.raw/*42.57*/("""</td>
                            <td> """),_display_(/*43.35*/subscription/*43.47*/.category),format.raw/*43.56*/("""</td>
                            """)))}}),format.raw/*45.18*/("""
                        """),format.raw/*46.25*/("""</tr>
                </tbody>
            </table>
        </div>
    """)))}),format.raw/*50.6*/("""

    """),_display_(/*52.6*/Option(allSubscriptionsList.items)/*52.40*/.filterNot(_.isEmpty).map/*52.65*/ { subscriptions =>_display_(Seq[Any](format.raw/*52.84*/("""
    """),format.raw/*53.5*/("""<div> <!-- for scroll bar -->
        <h3>All Subscriptions</h3>
     <table>
        <thead>
            <tr>
                """),_display_(/*58.18*/header("Name")),format.raw/*58.32*/("""
                """),_display_(/*59.18*/header("Cost of renewal")),format.raw/*59.43*/("""
                """),_display_(/*60.18*/header("Date of renewal")),format.raw/*60.43*/("""
                """),_display_(/*61.18*/header("Frequency")),format.raw/*61.37*/("""
                """),_display_(/*62.18*/header("Category")),format.raw/*62.36*/("""
            """),format.raw/*63.13*/("""</tr>
        </thead>
        <tbody>

        """),_display_(/*67.10*/subscriptions/*67.23*/.map/*67.27*/ {/*68.13*/case (subscription) =>/*68.35*/ {_display_(Seq[Any](format.raw/*68.37*/("""
                """),format.raw/*69.17*/("""<tr>
                    <td><a href=""""),_display_(/*70.35*/routes/*70.41*/.Application.edit(subscription.id.get)),format.raw/*70.79*/("""">"""),_display_(/*70.82*/subscription/*70.94*/.name),format.raw/*70.99*/("""</a></td>
                    <td> """),_display_(/*71.27*/subscription/*71.39*/.date),format.raw/*71.44*/("""</td>
                    <td> """),_display_(/*72.27*/subscription/*72.39*/.cost),format.raw/*72.44*/("""</td>
                    <td> """),_display_(/*73.27*/subscription/*73.39*/.frequency),format.raw/*73.49*/("""</td>
                    <td> """),_display_(/*74.27*/subscription/*74.39*/.category),format.raw/*74.48*/("""</td>
                </tr>
            """)))}}),format.raw/*77.10*/("""

        """),format.raw/*79.9*/("""</tbody>
     </table>
    </div>


    """)))}/*84.6*/.getOrElse/*84.16*/ {_display_(Seq[Any](format.raw/*84.18*/("""

        """),format.raw/*86.9*/("""<div class="well">
            <em>Nothing to display</em>
        </div>

    """)))}),format.raw/*90.6*/("""
""")))}),format.raw/*91.2*/("""




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
                  DATE: Mon Jun 13 15:56:09 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/list.scala.html
                  HASH: c2ae0afe042684fb30d1708c92d5837afc9fc1e4
                  MATRIX: 608->1|889->207|902->213|997->232|1032->241|1062->245|1087->250|1133->204|1161->256|1189->259|1202->265|1241->267|1272->272|1303->277|1365->319|1403->331|1417->336|1445->355|1496->368|1532->377|1631->449|1659->456|1695->465|1737->477|1770->483|1864->550|1879->556|1921->577|1994->624|2043->664|2077->689|2134->708|2170->717|2342->862|2377->876|2430->902|2476->927|2529->953|2575->978|2628->1004|2668->1023|2721->1049|2760->1067|2809->1088|2908->1160|2930->1173|2943->1177|2954->1200|2985->1222|3025->1224|3078->1249|3152->1296|3167->1302|3226->1340|3256->1343|3278->1355|3305->1360|3376->1404|3397->1416|3423->1421|3490->1461|3511->1473|3537->1478|3604->1518|3625->1530|3656->1540|3723->1580|3744->1592|3774->1601|3841->1654|3894->1679|3996->1751|4029->1758|4072->1792|4106->1817|4163->1836|4195->1841|4350->1969|4385->1983|4430->2001|4476->2026|4521->2044|4567->2069|4612->2087|4652->2106|4697->2124|4736->2142|4777->2155|4853->2204|4875->2217|4888->2221|4899->2236|4930->2258|4970->2260|5015->2277|5081->2316|5096->2322|5155->2360|5185->2363|5206->2375|5232->2380|5295->2416|5316->2428|5342->2433|5401->2465|5422->2477|5448->2482|5507->2514|5528->2526|5559->2536|5618->2568|5639->2580|5669->2589|5742->2640|5779->2650|5838->2691|5857->2701|5897->2703|5934->2713|6044->2793|6076->2795
                  LINES: 20->1|24->3|24->3|26->3|27->4|27->4|27->4|29->1|31->5|33->7|33->7|33->7|34->8|34->8|34->8|36->10|36->10|36->10|36->10|37->11|38->12|38->12|39->13|40->14|42->16|44->18|44->18|44->18|48->22|48->22|48->22|48->22|49->23|54->28|54->28|55->29|55->29|56->30|56->30|57->31|57->31|58->32|58->32|59->33|62->36|62->36|62->36|62->37|62->37|62->37|63->38|64->39|64->39|64->39|64->39|64->39|64->39|65->40|65->40|65->40|66->41|66->41|66->41|67->42|67->42|67->42|68->43|68->43|68->43|69->45|70->46|74->50|76->52|76->52|76->52|76->52|77->53|82->58|82->58|83->59|83->59|84->60|84->60|85->61|85->61|86->62|86->62|87->63|91->67|91->67|91->67|91->68|91->68|91->68|92->69|93->70|93->70|93->70|93->70|93->70|93->70|94->71|94->71|94->71|95->72|95->72|95->72|96->73|96->73|96->73|97->74|97->74|97->74|99->77|101->79|106->84|106->84|106->84|108->86|112->90|113->91
                  -- GENERATED --
              */
          