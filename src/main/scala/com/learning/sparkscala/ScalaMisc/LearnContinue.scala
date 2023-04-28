package com.learning.sparkscala.ScalaMisc
import util.control.Breaks._
object LearnContinue extends App{

  println("\n=== CONTINUE EXAMPLE ===")
  val searchMe = "peter piper picked a peck of pickled peppers"
  var numPs = 0
  for (i <- 0 until searchMe.length) {
    /**
    breakable {
      if (searchMe.charAt(i) != 'p') {
        break  // break out of the 'breakable', continue the outside loop
      } else {
        numPs += 1
      }
    }
**/

      if (searchMe.charAt(i) == 'p') {
        numPs += 1

    }
  }
  println("Found " + numPs + " p's in the string.")
}


