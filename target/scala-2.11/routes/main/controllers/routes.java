
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tristangreeno/workspace/PlayProject/conf/routes
<<<<<<< HEAD
// @DATE:Thu Jun 16 09:50:27 CDT 2016
=======
// @DATE:Mon Jun 13 14:29:56 CDT 2016
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
<<<<<<< HEAD
  public static final controllers.ReverseEmailController EmailController = new controllers.ReverseEmailController(RoutesPrefix.byNamePrefix());
=======
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
  public static final controllers.ReverseAuthController AuthController = new controllers.ReverseAuthController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
<<<<<<< HEAD
    public static final controllers.javascript.ReverseEmailController EmailController = new controllers.javascript.ReverseEmailController(RoutesPrefix.byNamePrefix());
=======
>>>>>>> 38ce55e2743188190547cbd4fafdad22ef87281e
    public static final controllers.javascript.ReverseAuthController AuthController = new controllers.javascript.ReverseAuthController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
