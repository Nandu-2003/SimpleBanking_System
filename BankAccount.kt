package com.example.bankaccountprogram

import android.service.autofill.FillEventHistory

class BankAccount(
    var accountHolder:String,
    var balance:Double){
//what are the features that a bank account can have


    private val transactionHistory = mutableListOf<String >("")
    fun deposit(amount:Double){
            balance +=amount
            transactionHistory.add("$accountHolder deposited $$amount")
    }
    fun WithDraw(amount:Double){
            if(amount>balance){
                println("you have insufficient balance")
            }
        else{
            balance-=amount
            transactionHistory.add("$accountHolder withdrew $$amount")

            }
    }
    fun displayTransactionHistory( ){
            println("Transaction history for $accountHolder")
            for(transaction in transactionHistory){
                println(transaction)
            }

    }
    fun DisplayAccountBalance(){
        println("$balance")
    }


}