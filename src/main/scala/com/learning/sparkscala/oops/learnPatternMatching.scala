package com.learning.sparkscala.oops

object learnPatternMatching extends App {
  println(matchTest("two"))   // Output as 2
  println(matchTest("test"))  //  many
  println(matchTest(1))     // one
  println(matchTest(11))     // scala.Int

  def matchTest(x:Any) : Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case _ => "many"
  }

}
