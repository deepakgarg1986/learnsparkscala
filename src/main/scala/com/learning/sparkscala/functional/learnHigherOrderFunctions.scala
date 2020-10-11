package com.learning.sparkscala.functional

object learnHigherOrderFunctions extends App {
/** Higher order functions take other functions as parameters or return a function as a result */
/* Example of Higher order function */
/* It  accepts function as a parameter */
  def apply(f:Int => String,v:Int) = f(v)

  def sumInts(a:Int, b: Int) : Int =
    if (a > b) 0 else a + sumInts(a+1,b)


//sum is higher order function, it accepts function as an argument

  def sum(f:Int => Int,a:Int, b: Int) : Int =
    if (a > b) 0 else f(a) + sum(f,a+1,b)

  def id (x:Int) : Int = x
  def cube(x:Int): Int = x * x * x
  def fact(x: Int) : Int = if (x==0) 1 else x*fact(x-1)

  def sumIntsHO(a:Int, b: Int) = sum(id,a,b)
  def sumCubesHO(a:Int, b: Int) = sum(cube,a,b)
  def sumFactorialHO(a:Int, b: Int) = sum(fact,a,b)
  def sumCubesHOA(a:Int, b: Int) = sum(x=> x*x*x,a,b)
  def sumCubes(a:Int, b: Int) : Int =
    if (a > b) 0 else cube(a) + sumCubes(a+1,b)

  def sumFactorials(a:Int, b:Int) : Int =
    if (a>b) 0 else fact(a) + sumFactorials(a+1,b)

  println(sumCubesHOA(1,4))
  (1 to 9).map(_ * 0.5).foreach(println)

}
