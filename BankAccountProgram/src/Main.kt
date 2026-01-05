fun main() {

  val henryBankAccount = BankAccount("Henry", 1332.20)
  val sarahBankAccount = BankAccount("Sarah", 0.00)

  henryBankAccount.deposit(200.0)
  henryBankAccount.withdraw(1200.0)
  henryBankAccount.deposit(3000.00)
  henryBankAccount.deposit(2000.00)
  henryBankAccount.withdraw(3333.15)

  sarahBankAccount.deposit(100.0)
  sarahBankAccount.withdraw(10.0)
  sarahBankAccount.deposit(300.0)

  henryBankAccount.displayTransactionHistory()
  sarahBankAccount.displayTransactionHistory()

  val henryBalance = henryBankAccount.acctBalance()
  val sarahBalance = sarahBankAccount.acctBalance()

  println("${henryBankAccount.accountHolder} balance is $henryBalance")
  println("${henryBankAccount.accountHolder} balance is $sarahBalance")

}