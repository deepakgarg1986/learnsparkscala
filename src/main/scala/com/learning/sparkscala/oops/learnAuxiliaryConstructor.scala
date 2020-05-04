package com.learning.sparkscala.oops

class learnAuxiliaryConstructor(firstname: String,
                                lastName: String,
                                middleName: String) {

  /**def this - Define an Auxiliary Constructor
  *Rule - First Line of Auxiliary Constructor ,you have to call primary constructor
    * While calling primary constructor , you need to pass all the arguments
  */
  println("Complete Name is " + firstname + lastName + middleName)
  def this(firstname: String) {
    this(firstname, "", "")
    println("First Name is " + firstname)
  }
}

//val p1 = new learnAuxiliaryConstructor("Ram" ,"Singh","")
//val p2 = new learnAuxiliaryConstructor(firstname ->"Ram")