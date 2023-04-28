package com.learning.sparkscala.oops

class learnClass  {

  private var value = 0 // fields must be initialized
  def incr()  {value += 1}
  def curr() = value
  def oneMoreFunc ()  { println ("One More Function")}


}

//Are we returning anything in function incr()