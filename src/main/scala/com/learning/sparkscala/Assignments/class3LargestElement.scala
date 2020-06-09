package com.learning.sparkscala.Assignments
import scala.io.Source
import java.io.File
import java.io.PrintWriter
object class3LargestElement extends App {

//Write a Scala program to get the largest element of an array using reduceLeft
  val Array1 = Array(1,302,210,444,76)
  val maxInArray1 = Array1.foldLeft(0)((a,b) => if (a>b )a else b)
  //println(maxInArray1)
//Implement the factorial function using to and reduceLeft, without a loop or
//recursion
  def fact (a: Int) : Int = {
    (1 to a).foldLeft(1)(_*_)
  }
  //println(fact(4))

  //Write a Scala code which reverses the lines of a file (makes the first line as the
  //last one, and so on)
  val reverseFile = Source.fromFile("Y:\\learnSparkScala\\learnsparkscala\\src\\test\\Resources\\Data\\textFile\\sampletextfile.txt")
    .getLines().toArray.reverse



 val writer = new PrintWriter(new File("Y:\\learnSparkScala\\learnsparkscala\\src\\test\\Resources\\Data\\outputtextFile\\reversetextfile.txt"))
  for (line  <- reverseFile){
  writer.write(line)
  writer.write('\n')}
  writer.close


  //Write a Scala code which reads a file and prints all words with more than 10
  //characters. Can you write all of it in a single line?

  val words = Source.fromFile("Y:\\learnSparkScala\\learnsparkscala\\src\\test\\Resources\\Data\\textFile\\sampletextfile.txt")
    .getLines().flatMap(x => x.split(" ")).filter(_.length > 10).foreach(println)

}
