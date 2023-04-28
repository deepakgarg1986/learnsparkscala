class learnAuxiliaryConstructor(firstname: String,
                                lastName: String,
                                middleName: String) {

  println("Complete Name is " + firstname +
    lastName + middleName)

  def this(firstname: String) {
    //Rule - In the first line of Auxiliary Constructor
    //We need to call either Primary Constructor or Previous defined Auxuliary Constructor
    //Calling is done using This keyword again
    this(firstname, "", "")
    println("First Name is " + firstname)
  }
}
//val a = new learnAuxiliaryConstructor(
  //"ram","rahim","singh")

val b = new learnAuxiliaryConstructor(
  "ram")
