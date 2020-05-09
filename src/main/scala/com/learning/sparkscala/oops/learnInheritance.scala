package com.learning.sparkscala.oops

class learnInheritance (speed:Int) {

  /** What can be inherit
    * What is difference between extend and import
    * When to use which?
    * Override keyword
    * Primary Constructor and base constructor
    *     */
  val mph: Int = speed
  def race() = println("Racing")

  def this (speed:Int, model:String) {
    this(speed)
    println("Speed of call is " + speed + "and model is " + model)
  }

}
/**
class Car(speed:Int)  extends learnInheritance(speed) {

  override val mph: Int = speed
  override def race() = println("Racing Car")

}

/** Posted question on stack overflow why we cannot extend auxiliary constructors of parent class */
val a = new Car(10,"Maruti")
println("Speed of Car: " + a.mph)
a.race()
*/
/**
val a = new Car(20)
println("Speed of Car: " + a.mph)
a.race()
*/