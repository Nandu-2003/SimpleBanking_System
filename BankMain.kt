package com.example.bankaccountprogram

fun main(){

    val myBankAccount = BankAccount("INKY",1338.20)

    myBankAccount.deposit(205.5)

    myBankAccount.WithDraw(256.3)
    myBankAccount.deposit(973.4)
    myBankAccount.deposit(1999.4)
    myBankAccount.WithDraw(79.8)
    myBankAccount.DisplayAccountBalance()

    val bank = BankAccount("Inky",0.0)
    bank.deposit(190.3)
    bank.deposit(1345.5)
    bank.WithDraw(20.0)
    bank.displayTransactionHistory()
    val totalBalance = myBankAccount.balance + bank.balance
    println("Total balance of all accounts: $$totalBalance")
}
