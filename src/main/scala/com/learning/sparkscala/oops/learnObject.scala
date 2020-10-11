package com.learning.sparkscala.oops

class learnObject  {
  private var value = 0 // fields must be initialized
  def incr() {value += 1}
  def curr() = value


}
/* What do we see after following declaration*/
/* how toString Function gets created automatically
* toString Function comes because class extends AnyRef which extends Any
* toString is the function of Any
val object1 = new learnObject()

object1.incr
object1.curr*/