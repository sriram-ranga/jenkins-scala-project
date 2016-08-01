name := "helloTest"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
 "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
 "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.9" % "test->default",
  "org.mockito" % "mockito-core" % "1.9.5",
  "joda-time" % "joda-time" % "2.9.1",
  "org.yaml" % "snakeyaml" % "1.8",
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "org.slf4j" % "slf4j-simple" % "1.7.5"
)