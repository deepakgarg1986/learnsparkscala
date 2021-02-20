trait basetrait {
  def log(msg:String) = ()
}

trait learnLearnedTraits2 extends basetrait {
  override def log(msg: String) {
    println(msg)
    super.log(msg)
  }
}

trait TimestampLogger extends basetrait {
   override def log (msg: String) {
    println("We are in Timestamp Logger")
    println(new java.util.Date() )
  }
}
class Logging extends   TimestampLogger with learnLearnedTraits2
val a = new Logging
a.log("Log Message")