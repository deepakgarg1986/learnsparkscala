package com.learning.sparkscala.Experiments
object Utils {
  var prevDelta = 0
  def runningSumDelta (currentDelta:Int): Int = {

    prevDelta = currentDelta + prevDelta
    prevDelta
  }



}
