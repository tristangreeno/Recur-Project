
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tristangreeno/workspace/PlayProject/conf/routes
// @DATE:Tue Jun 21 16:56:49 CDT 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWSController WSController = new controllers.ReverseWSController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseEmailController EmailController = new controllers.ReverseEmailController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAuthController AuthController = new controllers.ReverseAuthController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWSController WSController = new controllers.javascript.ReverseWSController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseEmailController EmailController = new controllers.javascript.ReverseEmailController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAuthController AuthController = new controllers.javascript.ReverseAuthController(RoutesPrefix.byNamePrefix());
  }

}
