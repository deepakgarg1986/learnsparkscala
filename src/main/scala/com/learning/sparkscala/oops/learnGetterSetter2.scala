package com.learning.sparkscala.oops

class learnGetterSetter2 {

  private var privateAge = 0
  def age = privateAge //getter
  def age_=(newAge: Int) { if (newAge > privateAge) privateAge = newAge } //setter

}



/*val a = new learnGetterSetter2

a.privateAge
a.privateAge_
a.age
a.age_= 10
a.age */