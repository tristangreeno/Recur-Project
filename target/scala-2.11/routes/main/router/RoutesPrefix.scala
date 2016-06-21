
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tristangreeno/workspace/PlayProject/conf/routes
// @DATE:Tue Jun 21 16:56:49 CDT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
