package com.learning.sparkscala.collections

object learnArray extends App {


    def createArray() = {

    /** How to create an Array **/
    /** Array with values */
    val intArray: Array[Int] = Array(1, 2, 3, 4, 5)
      intArray.foreach(println)
    val stringArray: Array[String] = Array("a", "b", "c")
    /** Array without values */
    var intArrayWV = new Array[Int](4)
    intArrayWV(2) = 23
    /** What differ types of array can be created */


    /** What we can do with Array **/
    intArray(2) = 10

    /** What we cannot do with array **/
    /** We can not change the size of array */
    intArray(4) = 12
    /** We cannot change the data type once it is declared */

    // intArray(3) = "ram"
    /** how to print an array */
    intArray.foreach(println)
      intArray



}



}
