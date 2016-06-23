
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

    """),format.raw/*8.5*/("""<h1 class="modal-header"> Add a subscription </h1>

    <div class="container-fluid">
    """),_display_(/*11.6*/form(routes.Application.save(user.userId))/*11.48*/ {_display_(Seq[Any](format.raw/*11.50*/("""
        """),format.raw/*12.9*/("""<fieldset>

            <dl class="form-group">
                <dt><label for="date">Date of renewal</label></dt>

                <dd>
                    <input type="date" class="form-control" id="date" name="date" value="" />
                </dd>
            </dl>

            <dl class="form-group" id="cost">
                <dt><label>Cost of renewal</label></dt>
                    <dd><input type="number" class="form-control" name="cost" placeholder="Enter the cost of renewal"/></dd>
            </dl>

            <dl class="form-group">
                <dt><label for="autocomplete">Subscription's Company Name</label></dt>

                <dd><select name="name" id="autocomplete" class="form-control" >
                </select></dd>
            </dl>


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

            <input type="hidden" name="userId" value=""""),_display_(/*62.56*/user/*62.60*/.id),format.raw/*62.63*/("""" />

        </fieldset>



        <div class="button-bar">
            <input type="submit" value="Create subscription" class="btn btn-success" style="width: 14.85em">
            <a href=""""),_display_(/*70.23*/routes/*70.29*/.Application.list()),format.raw/*70.48*/("""" class="btn btn-danger" style="width: 14.85em">Cancel</a>
        </div>
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
                  DATE: Thu Jun 23 13:26:23 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/createForm.scala.html
                  HASH: f801323ca8dec69fa7ff75c61e298e71dd262354
                  MATRIX: 628->36|802->115|830->118|843->124|882->126|914->132|1031->223|1082->265|1122->267|1158->276|3358->2449|3371->2453|3395->2456|3615->2649|3630->2655|3670->2674|3790->2764
                  LINES: 24->4|29->4|31->6|31->6|31->6|33->8|36->11|36->11|36->11|37->12|87->62|87->62|87->62|95->70|95->70|95->70|98->73
                  -- GENERATED --
              */
          