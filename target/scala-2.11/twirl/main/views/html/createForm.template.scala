
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

    """),format.raw/*8.5*/("""<style>
        body """),format.raw/*9.14*/("""{"""),format.raw/*9.15*/("""
            """),format.raw/*10.13*/("""justify-content: center;
        """),format.raw/*11.9*/("""}"""),format.raw/*11.10*/("""
    """),format.raw/*12.5*/("""</style>

    <h1 class="title"> Add a subscription </h1>

    """),_display_(/*16.6*/form(routes.Application.save(user.userId))/*16.48*/ {_display_(Seq[Any](format.raw/*16.50*/("""
        """),format.raw/*17.9*/("""<fieldset>

            <dl class="form-group">
                <dt><label for="date">Date of renewal</label></dt>

                <dd>
                    <input type="date" class="form-control" id="date" name="date" value="" />
                </dd>
            </dl>

            <dl class="form-group" id="cost">
                <dt><label>Cost of Renewal</label></dt>
                    <dd><input type="number" class="form-control" name="cost" placeholder="Cost of Renewal"/></dd>
            </dl>

                <select name="name" id="autocomplete">
                </select>


            <dl class="form-group" id="frequency">
                <dt><label for="frequency">Frequency of Renewal</label></dt>

                <dd><select name="frequency" class="form-control">
                    <option selected disabled>Select a frequency...</option>
                    <option value="7">Every week</option>
                    <option value="14">Every two weeks</option>
                    <option value="30">Once a month</option>
                    <option value="90">Every three months</option>
                    <option value="180">Every six months</option>
                    <option value="365">Every year</option>
                    <option value="730">Every two years</option>
                </select></dd>
            </dl>

            <dl class="form-group" id="category">
                <dt><label for="category">Subscription Category</label></dt>

                <dd><select name="category" class="form-control">
                    <option selected disabled>Choose a category...</option>
                    <option value="Business">Business</option>
                    <option value="Education">Education</option>
                    <option value="Entertainment">Entertainment</option>
                    <option value="Health">Health</option>
                </select></dd>
            </dl>

            <input type="hidden" name="userId" value=""""),_display_(/*63.56*/user/*63.60*/.id),format.raw/*63.63*/("""" />

        </fieldset>



        <div class="actions">
            <input type="submit" value="Create this subscription" class="btn btn-success"/>
            <a href=""""),_display_(/*71.23*/routes/*71.29*/.Application.list()),format.raw/*71.48*/("""" class="btn btn-danger">Cancel</a>
        </div>
    """)))}),format.raw/*73.6*/("""
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
                  DATE: Tue Jun 21 17:52:00 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/createForm.scala.html
                  HASH: 558c9aac551f1de6ff83888f99f2e7e8b18937d8
                  MATRIX: 628->36|802->115|830->118|843->124|882->126|914->132|962->153|990->154|1031->167|1091->200|1120->201|1152->206|1242->270|1293->312|1333->314|1369->323|3386->2313|3399->2317|3423->2320|3623->2493|3638->2499|3678->2518|3764->2574
                  LINES: 24->4|29->4|31->6|31->6|31->6|33->8|34->9|34->9|35->10|36->11|36->11|37->12|41->16|41->16|41->16|42->17|88->63|88->63|88->63|96->71|96->71|96->71|98->73
                  -- GENERATED --
              */
          