package com.learning.sparkscala.collections

object learnList {
  def main(args: Array[String]): Unit = {

    /** Creation of list*/
    val list1 = 1::2::3::Nil
    val list2 = List(1,2,3,4)
    val list3 = List(1,2.0, 33D,4000L)
    val list4 = List.range(1,10)
    val list5 = List.fill(3)("foo")
    val list6 = List.tabulate(5)(n => n*n)

    /** What we cannot do with List **/
    //list1(1) = 2



    list1.foreach(println)
    list2.foreach(println)
    list3.foreach(println)
    list4.foreach(println)
    list5.foreach(println)
    list6.foreach(println)

  }

}
