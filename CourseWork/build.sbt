lazy val setting = Seq(
  version := "1.0",
  scalaVersion := "2.13.2",
  libraryDependencies +=
    "org.scalatest" %% "scalatest" % "3.0.8" % Test,
)

lazy val CourseWork = project
  .in(file("."))
  .aggregate(Lab1, Lab2, Lab3, Lab4)
  .settings(setting)
  .dependsOn(Lab1, Lab2, Lab3, Lab4)

lazy val Lab1 = Project("lab1", file("Lab1"))
  .settings(setting)

lazy val Lab2 = Project("lab2", file("Lab2"))
  .settings(setting)

lazy val Lab3 =  Project("lab3", file("Lab3"))
  .settings(setting)

lazy val Lab4 =  Project("lab4", file("Lab4"))
  .settings(setting)