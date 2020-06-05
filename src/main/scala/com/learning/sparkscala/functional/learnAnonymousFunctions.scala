package com.learning.sparkscala.functional
import com.learning.sparkscala.functional.learnHigherOrderFunctions.{sum}

object learnAnonymousFunctions extends App {

  /** Sometimes it is tedious to have to define (and name the functions) using def    */

  val str = "abc"
  println(str)
  println("abc")
  def sumCubesHOA(a:Int, b: Int) = sum(x=> x*x*x,a,b)
  def sumIntsHO(a:Int, b: Int) = sum(x => x,a,b)

}
