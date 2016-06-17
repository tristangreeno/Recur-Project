package models

import be.objectify.deadbolt.scala.models.{Permission, Role, Subject}

/**
  * Created by tristangreeno on 6/1/16.
  */

case class User(id: Option[Long], userId: String, email: String, avatarUrl: String) extends Subject {

  override def identifier: String = userId

  override def permissions: List[Permission] = List.empty

  override def roles: List[Role] = List.empty
}
