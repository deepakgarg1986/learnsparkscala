package com.learning.sparkscala.Assignments

object  class3Edu1 extends App{

  class BankAccount(initBal : Double) {
    private var balance = initBal
    def deposit(amount:Double)= {
      balance = balance + amount
      balance
    }

    def withdraw(amount:Double)= {
      balance = balance - amount
      balance
    }
  }

  class CheckingAccount(initBal:Double) extends BankAccount(initBal) {
override def deposit( amount:Double )= { super.deposit(amount - 1 )}
override def withdraw ( amount:Double )= { super.withdraw(amount + 1 )}

  }
val a = new BankAccount(500)
  val b = new CheckingAccount(500)
  println(a.deposit(100))
  println(b.deposit(100))
  println(a.withdraw(100))
  println(b.withdraw(100))

}
