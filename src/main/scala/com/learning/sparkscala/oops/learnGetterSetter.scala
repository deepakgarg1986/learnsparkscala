package com.learning.sparkscala.oops
/*Scala Provides Getter and Setter By Default*/
class learnGetterSetter {
  var size = 1
}

//val f = new learnGetterSetter
//val a =  f.size
//println("Printing before setting value: " + f.size)
//f.size = 10
//f.size_=(10)
//println("Printing after setting value: " + f.size)

/** How size_= function got created - Question posted on StackOverflow

* Compiler autogenerates getters and setters for any var inside a class They don't come from any parent class.
  * Both subtyping and the use of variables are discouraged in Scala

  */


