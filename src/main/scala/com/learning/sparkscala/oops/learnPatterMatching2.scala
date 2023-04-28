package com.learning.sparkscala.oops

object learnPatterMatching2 {

  def main(args: Array[String]): Unit = {

   case class Person(name: String, age: Int)
    val alice =  new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie =  new Person("Charlie", 32)

   // val kailas = Person("Kailas")
    for (person <- List(alice, bob, charlie)) {
      person match {

        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) => println("Age: " + age + "year, name: " + name + "?")
        case _   => println("DOes not match")
      }
    }
  }
}
