name := "PlayProject"

version := "1.0"

lazy val `playproject` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.postgresql" % "postgresql" % "9.4.1208.jre7",
  jdbc, cache, ws, specs2 % Test,
  "com.typesafe.play" %% "play-slick" % "2.0.0",
  "be.objectify" %% "deadbolt-scala" % "2.5.0",
  "com.typesafe.play" %% "play-mailer" % "5.0.0-M1"
)

unmanagedResourceDirectories in Test <+= baseDirectory(_ / "target/web/public/test")

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

fork in run := true