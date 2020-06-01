package com.learning.sparkscala.oops

trait learnLayeredTraits  {
  def log (msg: String) {println(msg)}

}
/**trait TimestampLogger extends learnLayeredTraits {
  abstract override def log (msg: String) {
    println(new java.util.Date() )
    super.log(new java.util.Date() + " " + msg)

  }
}

trait ShortLogger extends learnLayeredTraits {
  val maxLength = 15
  abstract override def log(msg: String) {
    super.log( if (msg.length <= maxLength) msg
    else msg.substring(0,maxLength -3) + "...")
  }
}

class togging extends  TimestampLogger with ShortLogger




val a = new togging
a.log("This is interesting example")
*/