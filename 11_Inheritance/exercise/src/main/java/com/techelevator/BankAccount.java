package com.techelevator;

public class BankAccount {

    //member vars
    private String accountHolderName;
    private String accountNumber;
    private int balance;


    //constructors

    public BankAccount(){

    }

    public BankAccount(String accountHolderName, String accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String accountHolderName, String accountNumber, int balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //methods

    public int deposit(int amountToDeposit){
        balance += amountToDeposit;
        return balance;
    }
    public int withdraw (int amountToWithdraw){
        balance -= amountToWithdraw;
        return balance;
    }

    //getters

    public String getAccountHolderName(){
        return accountHolderName;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }

}
