package com.learning.sparkscala.ScalaMisc
import util.control.Breaks._
object LearnBreak extends App {

  breakable {
    for (i <- 1 to 10) {
      println(i)
      if (i > 4) break  // break out of the for loop
    }
  }


}
