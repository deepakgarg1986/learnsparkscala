package com.learning.sparkscala.oops

class learnAuxiliaryConstructor(firstname: String,
                                lastName: String,
                                middleName: String) {

  /**def this - Define an Auxiliary Constructor
  *Rule - Each auxiliary constructor must have a different signature (different parameter lists)
    * Each constructor must call one of the previously defined constructors
  */
  println("Complete Name is " + firstname + lastName + middleName)
  def this(firstname: String) {
    this(firstname, "", "")
    println("First Name is " + firstname)
  }
}

//val p1 = new learnAuxiliaryConstructor("Ram" ,"Singh","")
//val p2 = new learnAuxiliaryConstructor(firstname ->"Ram")