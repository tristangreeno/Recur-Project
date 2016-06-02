package modules

import be.objectify.deadbolt.scala.DeadboltHandler
import be.objectify.deadbolt.scala.cache.HandlerCache
import play.api.inject.{Binding, Module}
import play.api.{Configuration, Environment}
import security._

/**
  *
  */
class CustomBindings extends Module  {
  override def bindings(environment: Environment,
                        configuration: Configuration): Seq[Binding[_]] =
    Seq(
      bind[DeadboltHandler].to[MyDeadboltHandler],
      bind[HandlerCache].to[MyHandlerCache],
      bind[AuthSupport].toSelf
    )
}
