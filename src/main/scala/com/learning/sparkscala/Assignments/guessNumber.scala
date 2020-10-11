package com.learning.sparkscala.Assignments


/* Write a program to make a user guess a generated random number between 1 and 10.
Follow these steps:

Generate a random number between 1 and 10 (both inclusive)

Take the number provided by the user

If the number provided by the user is incorrect, provide hints, if the guessed number is less than or greater than the chosen number and ask to try again

If the number provided by the user is correct, show a success message along with the number of attempts */


object guessNumber {
  def main(args: Array[String]) {
    // write your code here
    var userInput:Int = 0
    var randomInt:Int = 1
    def getrandomInt {
      randomInt = scala.util.Random.nextInt(10)
    }
    def getUserInput
    {
      userInput = scala.io.StdIn.readInt()
    }
    do
    {
      println("Please try again: ")
      getUserInput
      getrandomInt}
    while ( userInput != randomInt)
    println("Your number " + userInput.toString + " is correct")
  }

}
