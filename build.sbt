name := "kafka-fw"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.kafka" % "kafka-clients" % "0.9.0.0"

/*libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.7.12"*/


libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2"

/*libraryDependencies += "log4j" % "log4j" % "1.2.17"*/

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.2"