package com.learning.sparkscala.oops

trait learnLearnedTraits2 {
  def log(msg: String) {
    println(msg)
  }
}
/**
  trait TimestampLogger  {
    def log (msg: String) {
      println("We are in Timestamp Logger")
      println(new java.util.Date() )
    }
  }
  class Logging extends   TimestampLogger with learnLearnedTraits2
  val a = new Logging
  a.log("Log Message")

**/
//