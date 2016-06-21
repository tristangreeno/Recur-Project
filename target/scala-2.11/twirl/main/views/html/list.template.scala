
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
    """),format.raw/*8.5*/("""<img src=""""),_display_(/*8.16*/routes/*8.22*/.Assets.versioned("images/Recur300x300a.png")),format.raw/*8.67*/("""" style="width: 30em; height: auto; display: block; margin-left: auto; margin-right: auto"/>

    """),_display_(/*10.6*/flash/*10.11*/.get("success").map/*10.30*/ { message =>_display_(Seq[Any](format.raw/*10.43*/("""
        """),format.raw/*11.9*/("""<div class="alert-message warning">
            <strong>Done!</strong> """),_display_(/*12.37*/message),format.raw/*12.44*/("""
        """),format.raw/*13.9*/("""</div>
    """)))}),format.raw/*14.6*/("""

    """),_display_(/*16.6*/Option(impendingSubscriptionsList.items)/*16.46*/.filterNot(_.isEmpty).map/*16.71*/ { subscriptions =>_display_(Seq[Any](format.raw/*16.90*/("""
        """),format.raw/*17.9*/("""<div class="panel panel-default">
            <div class="panel-heading">Impending Subscriptions</div>
            <table class="table">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Cost of renewal</th>
                        <th>Date of renewal</th>
                        <th>Frequency</th>
                        <th>Category</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*30.18*/subscriptions/*30.31*/.map/*30.35*/ {/*31.21*/case (subscription) =>/*31.43*/ {_display_(Seq[Any](format.raw/*31.45*/("""
                        """),format.raw/*32.25*/("""<tr>
                            <td><a href=""""),_display_(/*33.43*/routes/*33.49*/.Application.edit(subscription.id.get)),format.raw/*33.87*/("""">"""),_display_(/*33.90*/subscription/*33.102*/.name),format.raw/*33.107*/("""</a></td>
                            <td> """),_display_(/*34.35*/subscription/*34.47*/.date),format.raw/*34.52*/("""</td>
                            <td> """),_display_(/*35.35*/subscription/*35.47*/.cost),format.raw/*35.52*/("""</td>
                            <td> """),_display_(/*36.35*/subscription/*36.47*/.frequency),format.raw/*36.57*/("""</td>
                            <td> """),_display_(/*37.35*/subscription/*37.47*/.category),format.raw/*37.56*/("""</td>
                            """)))}}),format.raw/*39.18*/("""
                        """),format.raw/*40.25*/("""</tr>
                </tbody>
            </table>
        </div>
    """)))}),format.raw/*44.6*/("""

    """),_display_(/*46.6*/Option(allSubscriptionsList.items)/*46.40*/.filterNot(_.isEmpty).map/*46.65*/ { subscriptions =>_display_(Seq[Any](format.raw/*46.84*/("""
    """),format.raw/*47.5*/("""<div class="panel panel-default">
        <div class="panel-heading">All Subscriptions</div>
     <table class="table">
        <thead>
            <tr>
                <th>Name</th>
                <th>Cost of renewal</th>
                <th>Date of renewal</th>
                <th>Frequency</th>
                <th>Category</th>
            </tr>
        </thead>
        <tbody>

        """),_display_(/*61.10*/subscriptions/*61.23*/.map/*61.27*/ {/*62.13*/case (subscription) =>/*62.35*/ {_display_(Seq[Any](format.raw/*62.37*/("""
                """),format.raw/*63.17*/("""<tr>
                    <td><a href=""""),_display_(/*64.35*/routes/*64.41*/.Application.edit(subscription.id.get)),format.raw/*64.79*/("""">"""),_display_(/*64.82*/subscription/*64.94*/.name),format.raw/*64.99*/("""</a></td>
                    <td> """),_display_(/*65.27*/subscription/*65.39*/.date),format.raw/*65.44*/("""</td>
                    <td> """),_display_(/*66.27*/subscription/*66.39*/.cost),format.raw/*66.44*/("""</td>
                    <td> """),_display_(/*67.27*/subscription/*67.39*/.frequency),format.raw/*67.49*/("""</td>
                    <td> """),_display_(/*68.27*/subscription/*68.39*/.category),format.raw/*68.48*/("""</td>
                </tr>
            """)))}}),format.raw/*71.10*/("""

        """),format.raw/*73.9*/("""</tbody>
     </table>
    </div>


    """)))}/*78.6*/.getOrElse/*78.16*/ {_display_(Seq[Any](format.raw/*78.18*/("""

        """),format.raw/*80.9*/("""<div class="well">
            <em>Nothing to display</em>
        </div>

    """)))}),format.raw/*84.6*/("""
""")))}),format.raw/*85.2*/("""




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
                  DATE: Tue Jun 21 17:14:51 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/list.scala.html
                  HASH: da59cffbec2467698d430eb807ddc86746c34c7f
                  MATRIX: 608->1|889->207|902->213|997->232|1032->241|1062->245|1087->250|1133->204|1161->256|1189->259|1202->265|1241->267|1272->272|1309->283|1323->289|1388->334|1513->433|1527->438|1555->457|1606->470|1642->479|1741->551|1769->558|1805->567|1847->579|1880->586|1929->626|1963->651|2020->670|2056->679|2582->1178|2604->1191|2617->1195|2628->1218|2659->1240|2699->1242|2752->1267|2826->1314|2841->1320|2900->1358|2930->1361|2952->1373|2979->1378|3050->1422|3071->1434|3097->1439|3164->1479|3185->1491|3211->1496|3278->1536|3299->1548|3330->1558|3397->1598|3418->1610|3448->1619|3515->1672|3568->1697|3670->1769|3703->1776|3746->1810|3780->1835|3837->1854|3869->1859|4291->2254|4313->2267|4326->2271|4337->2286|4368->2308|4408->2310|4453->2327|4519->2366|4534->2372|4593->2410|4623->2413|4644->2425|4670->2430|4733->2466|4754->2478|4780->2483|4839->2515|4860->2527|4886->2532|4945->2564|4966->2576|4997->2586|5056->2618|5077->2630|5107->2639|5180->2690|5217->2700|5276->2741|5295->2751|5335->2753|5372->2763|5482->2843|5514->2845
                  LINES: 20->1|24->3|24->3|26->3|27->4|27->4|27->4|29->1|31->5|33->7|33->7|33->7|34->8|34->8|34->8|34->8|36->10|36->10|36->10|36->10|37->11|38->12|38->12|39->13|40->14|42->16|42->16|42->16|42->16|43->17|56->30|56->30|56->30|56->31|56->31|56->31|57->32|58->33|58->33|58->33|58->33|58->33|58->33|59->34|59->34|59->34|60->35|60->35|60->35|61->36|61->36|61->36|62->37|62->37|62->37|63->39|64->40|68->44|70->46|70->46|70->46|70->46|71->47|85->61|85->61|85->61|85->62|85->62|85->62|86->63|87->64|87->64|87->64|87->64|87->64|87->64|88->65|88->65|88->65|89->66|89->66|89->66|90->67|90->67|90->67|91->68|91->68|91->68|93->71|95->73|100->78|100->78|100->78|102->80|106->84|107->85
                  -- GENERATED --
              */
          