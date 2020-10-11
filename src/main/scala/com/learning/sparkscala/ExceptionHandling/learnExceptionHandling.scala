package com.learning.sparkscala.ExceptionHandling

import java.io.FileNotFoundException

object learnExceptionHandling extends App{

  def readFile() {
//try block
    try {
      val empText = scala.io.Source.fromFile("C:\\Users\\sapnag\\Desktop\\Edureka\\July Batch\\Class 4\\exceptionhandling\\emp1.txt")

      val empData = empText.mkString
      println("This is try Block")
      println(empData)
    }
//catch Block
    catch {
     case e: FileNotFoundException => println("File Not Found")
    }

//finally Block
  /**  finally
   {
     println("This is final Block")
   }
*/



  }
  readFile()

}
