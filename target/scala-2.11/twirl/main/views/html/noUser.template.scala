
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object noUser_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class noUser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>Recur</title>
<<<<<<< HEAD
        <link rel="stylesheet" href=""""),_display_(/*8.39*/routes/*8.45*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*8.95*/("""">
        <script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*9.78*/("""" type="text/javascript"></script>
    </head>

    <header class="topbar">
        <h1 class="fill">
            <a href=""""),_display_(/*14.23*/routes/*14.29*/.Application.index()),format.raw/*14.49*/("""">
=======
    </head>
    <header class="topbar">
        <h1 class="fill">
            <a href=""""),_display_(/*11.23*/routes/*11.29*/.Application.index()),format.raw/*11.49*/("""">
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
        Recur &mdash; Subscriptions Database
      </a>
        </h1>
    </header>

    <section id="main">
<<<<<<< HEAD
    """),_display_(/*21.6*/content),format.raw/*21.13*/("""
    """),format.raw/*22.5*/("""</section>
=======
    """),_display_(/*18.6*/content),format.raw/*18.13*/("""
    """),format.raw/*19.5*/("""</section>
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
</html>"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


}

/**/
object noUser extends noUser_Scope0.noUser
              /*
                  -- GENERATED --
<<<<<<< HEAD
                  DATE: Wed Jun 15 15:27:47 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/noUser.scala.html
                  HASH: 21726d0ee96346a88c6d2922265a5f38b9d98fec
                  MATRIX: 527->1|637->16|665->18|803->130|817->136|887->186|938->211|952->217|1021->266|1172->390|1187->396|1228->416|1371->533|1399->540|1431->545
                  LINES: 20->1|25->1|27->3|32->8|32->8|32->8|33->9|33->9|33->9|38->14|38->14|38->14|45->21|45->21|46->22
=======
                  DATE: Wed Jun 08 15:49:07 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/noUser.scala.html
                  HASH: 9a61a3bc2e27a254a399def7dc90034435ddd164
                  MATRIX: 527->1|637->16|665->18|854->180|869->186|910->206|1053->323|1081->330|1113->335
                  LINES: 20->1|25->1|27->3|35->11|35->11|35->11|42->18|42->18|43->19
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
                  -- GENERATED --
              */
          