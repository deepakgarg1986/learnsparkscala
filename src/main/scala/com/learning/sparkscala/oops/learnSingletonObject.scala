package com.learning.sparkscala.oops

object learnSingletonObject extends App {
private var lastNum = 0
  def newReservation() =  {lastNum +=1 ; lastNum}

}
////learnSingletonObject.newReservation