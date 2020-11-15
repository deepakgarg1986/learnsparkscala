package com.learning.sparkscala.oops

class learnAuxiliaryConstructor(firstname: String,
                                lastName: String,
                                middleName: String) {

  /**def this - Define an Auxiliary Constructor
  *Rule - Each auxiliary constructor must have a different signature (different parameter lists)
    * Each constructor must call one of the previously defined constructors
  */
  println("Complete Name is " + firstname + lastName + middleName)

//Using the keyword This
  //defination of auxiliary constructor is similar to function declaration
  def this(firstname: String) {
    //Rule - In the first line of Auxiliary Constructor
    //We need to call either Primary Constructor or Previous defined Auxuliary Constructor
    //Calling is done using This keyword again
    this(firstname, "", "")
    println("First Name is " + firstname)
  }
}

//val p1 = new learnAuxiliaryConstructor("Ram" ,"Singh","")
//val p2 = new learnAuxiliaryConstructor("Ram")