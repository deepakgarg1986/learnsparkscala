package com.learning.sparkscala.collections

object learnArray {

  def main(args: Array[String]): Unit = {

    /** How to create an Array**/
    val a = Array(1, 2, 3, 4, 5)

    /** What we can do with Array **/
    val a(2) = 10

    /** What we cannot do with array **/
    val a(3) = "ram"
  }
}
