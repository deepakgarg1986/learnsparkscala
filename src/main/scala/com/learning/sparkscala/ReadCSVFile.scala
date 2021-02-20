package com.learning.sparkscala

import scala.io.Source.fromFile
object ReadCSVFile extends App {

  val bufferedSource = scala.io.Source.fromFile("C:\\Users\\sapnag\\Desktop\\Edureka\\AAON.csv")
  for (line <- bufferedSource.getLines) {
    val cols = line.split(",").map(_.trim)
    // do whatever you want with the columns here
    println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)}")
  }
  bufferedSource.close

}
