package com.learning.sparkscala.oops

class learnMultipleAuxuliaryConstructor(firstname: String,
                                        lastName: String,
                                        middleName: String) {

  /**def this - Define an Auxiliary Constructor
      *Rule - First Line of Auxiliary Constructor ,you have to call primary constructor
      * While calling primary constructor , you need to pass all the arguments
      */
  println("This is primary constructor")
  println("Complete Name is " + firstname + lastName + middleName)
  def this(firstname: String) {
    this(firstname, "", "")
    println("This is Auxiliary constructor with firstname")
    println("First Name is " + firstname)
  }
  def this(lastname: String) {
    this("", lastname, "")
    println("This is Auxiliary constructor with lastname")
    println("lastname  is " + lastname)
  }
}
//val p1 = new learnMultipleAuxuliaryConstructor("Ram","Sharma","Pawan")
//val p2 = new learnMultipleAuxuliaryConstructor("Ram")
//val p3 = new learnMultipleAuxuliaryConstructor("Ram","Sharma")

/** Understanding as of now is we cannot create 2 auxiliary constructor each with primary name and auxuliary name arguemnt
* as it creates ambiguity
  */
