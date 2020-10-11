package com.learning.sparkscala.functional

object learnCurryingFunction extends App{

  //normal function
  def calculatePrice(numberOfItems: Int, priceOfItems: Int) = numberOfItems * priceOfItems

 //currying Function
  def calculatePriceCurrying(numberOfItems: Int) = (priceOfItems: Int) => numberOfItems * priceOfItems

  val normalValue = calculatePrice(12,10)
  println(normalValue)

  val curryingFunc = calculatePriceCurrying(12)
  val curryingFuncValue = curryingFunc(15)
  println(curryingFuncValue)

}
