
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tristangreeno/workspace/PlayProject/conf/routes
<<<<<<< HEAD
// @DATE:Thu Jun 16 09:50:27 CDT 2016
=======
// @DATE:Mon Jun 13 14:29:56 CDT 2016
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e


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
