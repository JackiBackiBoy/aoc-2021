ThisBuild / organization := "JackiBackiBoy"
ThisBuild / version      := "0.1.0"
ThisBuild / scalaVersion := "3.1.0"

lazy val root = (project in file(".")).aggregate(day1, day2).dependsOn(day1, day2)
lazy val day1 = (project in file("day1"))
lazy val day2 = (project in file("day2"))