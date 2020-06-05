package com.learning.sparkscala.functional

object learnHigherOrderFunctions2 extends App {

  /* map */
  (1 to 9).map(0.1 * _)
  /* foreach */
  (1 to 9).map("*" * _).foreach(println _)
  /* filter */
  (1 to 9).filter(_ % 2 == 0)
  /* reduceLeft */
  (1 to 9).reduceLeft(_ * _)
  /* split, sortWith */
  "Mary had a little lamb".split(" ").sortWith(_.length < _.length)
}
