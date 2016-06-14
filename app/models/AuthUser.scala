package models

import be.objectify.deadbolt.scala.models.{Permission, Role, Subject}


/**
  * Created by tristangreeno on 6/1/16.
  */
case class AuthUser(userId: String, name: String, avatarUrl: String) extends Subject {

  override def identifier: String = userId

  // Define roles and permissions if time allows
  override def roles: List[_ <: Role] = List.empty

  override def permissions: List[_ <: Permission] = List.empty
}
