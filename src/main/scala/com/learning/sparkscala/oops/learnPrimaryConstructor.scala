package com.learning.sparkscala.oops

class learnPrimaryConstructor(firstname: String,
                              lastName: String,
                              middleName: String) {
  println(firstname +' '+ lastName +' '+ middleName)
  def first() { println(firstname) }
  def middle() { println(lastName) }
}
//  val p1 = new learnPrimaryConstructor("Ram" ,"Singh","")
