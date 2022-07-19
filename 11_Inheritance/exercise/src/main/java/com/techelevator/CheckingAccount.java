package com.techelevator;

public class CheckingAccount extends BankAccount {

    private int withdraw;

    //constructors
    public CheckingAccount() {

    }

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    //methods and getters
    @Override
    public int withdraw(int amountToWithdraw){
        int overDraftFee = 10;
        if (this.getBalance() - amountToWithdraw <= -100) {
            return this.getBalance();
        }
        if (this.getBalance() - amountToWithdraw < 0) {
            super.withdraw(overDraftFee + amountToWithdraw);
            return this.getBalance();
        }
        super.withdraw((amountToWithdraw));
        return getBalance();
    }
    public int getWithdraw(){
        return withdraw;
    }

}
