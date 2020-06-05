
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

class CheckingAccount extends BankAccount(amount) {
  def deposit( amount:Double )= { super.deposit(amount - 1 )}
  def withdraw ( amount:Double )= { super.withdraw(amount + 1 )}

}