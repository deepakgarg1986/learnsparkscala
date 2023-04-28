package com.learning.sparkscala.ScalaMisc
import util.control.Breaks._
object LearnContinue2 extends App{


    for (i <- 1 to 10) {
      breakable {
        if (i % 2 == 0) break
        println(i)
      }
    }


}
