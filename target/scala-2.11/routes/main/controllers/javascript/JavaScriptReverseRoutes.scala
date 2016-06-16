
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tristangreeno/workspace/PlayProject/conf/routes
<<<<<<< HEAD
// @DATE:Thu Jun 16 09:50:27 CDT 2016
=======
// @DATE:Mon Jun 13 14:29:56 CDT 2016
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

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
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

<<<<<<< HEAD
  // @LINE:12
  class ReverseEmailController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def sendEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmailController.sendEmail",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions/email"})
        }
      """
    )
  
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
    def logIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.logIn",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:27
=======
    // @LINE:24
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
    def callback: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.callback",
      """
        function(code0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "callback" + _qS([(""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("code", code0)])})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:28
=======
    // @LINE:25
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
    def logOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.logOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
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
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.delete",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:15
=======
    // @LINE:12
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions/new"})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:19
=======
    // @LINE:16
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:20
=======
    // @LINE:17
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:16
=======
    // @LINE:13
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.save",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions/save/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
    // @LINE:9
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}
