
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tristangreeno/workspace/PlayProject/conf/routes
// @DATE:Mon Jun 13 14:29:56 CDT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:28
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseAuthController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def logIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.logIn",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:24
    def callback: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.callback",
      """
        function(code0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "callback" + _qS([(""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("code", code0)])})
        }
      """
    )
  
    // @LINE:25
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

  
    // @LINE:20
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.delete",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:12
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions/new"})
        }
      """
    )
  
    // @LINE:16
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:17
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:13
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
