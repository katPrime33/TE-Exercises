package com.techelevator;



public class CreditCardAccount implements Accountable{
    private String accountHolder;
    private String accountNumber;
    private int debt;

    public CreditCardAccount(String accountHolder, String accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public int pay(int amountToPay){
         debt -= amountToPay;
         return debt;
    }

    public int charge(int amountToCharge){
        debt += amountToCharge;
        return debt;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    @Override
    public int getBalance() {
        return -debt;
    }

    public int getDebt() {
        return debt;
    }
}
