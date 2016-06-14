package controllers

/**
  * Created by tristangreeno on 6/2/16.
  */

import javax.inject.Inject

import play.api.Configuration
import play.api.cache.CacheApi
import play.api.mvc.{Action, Controller}
import security.{Auth0ConfigKeys, AuthSupport}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

/**
  * Based on code taken directly from Auth0.
  */
class AuthController @Inject()(cache: CacheApi,
                               config: Configuration,
                               authSupport: AuthSupport) extends Controller {

  private val clientId: String = config.getString(Auth0ConfigKeys.ClientId).getOrElse("TVs7gIdAHazkonw9oBkCjqcBMctQnWOZ")
  private val domain: String = config.getString(Auth0ConfigKeys.Domain).getOrElse("tgreeno.auth0.com")
  private val redirectUri: String = config.getString(Auth0ConfigKeys.RedirectURI).getOrElse("https://morning-atoll-53317.herokuapp.com/callback")

  // callback route
  def callback(codeOpt: Option[String] = None) = Action.async { request =>
    (for {
      code <- codeOpt
    } yield {
      authSupport.getToken(code).flatMap { case (idToken, accessToken) =>
        authSupport.getUser(accessToken).map { userJson =>
          authSupport.bindAndCache(idToken,
            userJson)
          Redirect(routes.Application.index()).withSession(authSupport.authenticatedSession(request.session,
            idToken,
            accessToken))
        }
      }.recover {
        case ex: IllegalStateException => Unauthorized(ex.getMessage)
      }
    }).getOrElse(Future.successful(BadRequest("No parameters supplied")))
  }

  def logIn = Action.async {
    Future {
      Ok(views.html.security.login(clientId,
        domain,
        redirectUri))
    }
  }

  def logOut = Action.async { request =>
    Future {
      Ok(views.html.security.login(clientId,
        domain,
        redirectUri))
        .withSession(authSupport.cleanUp(request.session))
    }
  }
}

