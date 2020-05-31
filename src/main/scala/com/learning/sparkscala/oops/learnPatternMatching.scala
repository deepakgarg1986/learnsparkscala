package com.learning.sparkscala.oops

object learnPatternMatching extends App {
  println(matchTest("two"))
  println(matchTest("test"))
  println(matchTest(1))


  def matchTest(x:Any) : Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case _ => "many"
  }

}