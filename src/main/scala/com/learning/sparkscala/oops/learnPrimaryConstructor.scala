package com.learning.sparkscala.oops

class learnPrimaryConstructor(firstname: String,
                              lastName: String,
                              middleName: String) {
  println(firstname +' '+ lastName +' '+ middleName)
  def first() { println(firstname) }
  def middle() { println(middleName) }
  def last() {println(lastName)}

  first()
  middle()
  last()
}
//  val p1 = new learnPrimaryConstructor("Ram" ,"Singh","")
