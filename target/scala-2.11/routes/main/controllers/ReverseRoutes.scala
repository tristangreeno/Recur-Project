
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tristangreeno/workspace/PlayProject/conf/routes
<<<<<<< HEAD
// @DATE:Thu Jun 16 09:50:27 CDT 2016
=======
// @DATE:Mon Jun 13 14:29:56 CDT 2016
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

<<<<<<< HEAD
  // @LINE:31
=======
  // @LINE:28
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
<<<<<<< HEAD
    // @LINE:31
=======
    // @LINE:28
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

<<<<<<< HEAD
  // @LINE:12
  class ReverseEmailController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def sendEmail(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "subscriptions/email")
    }
  
  }

  // @LINE:26
=======
  // @LINE:23
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
  class ReverseAuthController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
<<<<<<< HEAD
    // @LINE:26
=======
    // @LINE:23
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
    def logIn(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
<<<<<<< HEAD
    // @LINE:27
=======
    // @LINE:24
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
    def callback(code:Option[String]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "callback" + queryString(List(Some(implicitly[QueryStringBindable[Option[String]]].unbind("code", code)))))
    }
  
<<<<<<< HEAD
    // @LINE:28
=======
    // @LINE:25
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
    def logOut(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
<<<<<<< HEAD
    // @LINE:23
=======
    // @LINE:20
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "subscriptions/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
<<<<<<< HEAD
    // @LINE:15
=======
    // @LINE:12
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "subscriptions/new")
    }
  
<<<<<<< HEAD
    // @LINE:19
=======
    // @LINE:16
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
    def edit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "subscriptions/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
<<<<<<< HEAD
    // @LINE:20
=======
    // @LINE:17
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "subscriptions/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
<<<<<<< HEAD
    // @LINE:16
=======
    // @LINE:13
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
    def save(id:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "subscriptions/save/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:9
    def list(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "subscriptions")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }


}
