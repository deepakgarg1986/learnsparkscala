package com.learning.sparkscala.oops

trait learnLayeredTraits  {
  def log (msg: String) {println(msg)}

}
/**trait TimestampLogger extends learnLayeredTraits {
   override def log (msg: String) {
println("We are in Timestamp Logger")
    println(new java.util.Date() )
    super.log(new java.util.Date() + " " + msg)

  }
}

trait ShortLogger extends learnLayeredTraits {
  val maxLength = 15
   override def log(msg: String) {
println("We are in Short Logger")
    super.log( if (msg.length <= maxLength) msg
    else msg.substring(0,maxLength -3) + "...")
  }
}

class Logging extends  TimestampLogger with ShortLogger




val a = new Logging
a.log("Logger example")
*/