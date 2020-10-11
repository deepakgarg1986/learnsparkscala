package com.learning.sparkscala.collections
import Array.ofDim
object learnMultidimentionalArray {
  def main(args: Array[String]): Unit = {

    //Find below the syntax for multi-dimensional arrays
    /* var arrayName = Array.ofDim [ DataType ] ( r , c )
    *     */

    //The below example shows a multi-dimensional array using ofDim keyword

    //Sample 1
    var employeeMatrix = ofDim[Int](3,3)
    //Sample 2
    var empRating: Array[Array[Int]] = new Array[ Array[Int] ] (2)
    empRating(0)=new Array[Int](3)
    empRating(1)=new Array[Int](4)
    empRating(0)(0)=1
    empRating(0)(1)=2
    empRating(0)(2)=3
    println("Employee Rating Is: "+empRating(0)(0) + " " + empRating(0)(1) + " " + empRating(0)(2))




  }

}
