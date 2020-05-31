package com.learning.sparkscala.oops

/** Object and Class shares the same name
both object and class should be defined in same source file
Class is companion class of the singleton object
Object and classes have access to each other private members
*/


class learnCompanionObject {
  val id = learnCompanionObject.newNum()
  private var bal = 0.0
}

object learnCompanionObject {

  private var lastNum = 0
  private def newNum() = {
    lastNum += 1
    lastNum
  }

}
