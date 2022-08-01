package com.techelevtor;

public class MasterCard extends CreditCard{
    @Override
    public void validate() throws CreditCardValidationException{
        super.validate();
        //Mastercard numbers always begin with '5'
        if(getNumber().charAt(0) != 5){
            throw new CreditCardValidationException("'" + getNumber() +
                    "' - Invalid Mastercard card number, must begin with '5'.");
        }
    }
}
