package com.learning.sparkscala.oops
//Companion Class
class learnCompanion { var name = "" }

//Companion Object
object learnCompanion {
  def apply(name: String): learnCompanion = {
    var p = new learnCompanion
    p.name = name
    p
  }
}
/*
val a = learnCompanion("Deepak")
val b = new learnCompanion
a.name
b.name_=("Deepak")
b.name
  */
