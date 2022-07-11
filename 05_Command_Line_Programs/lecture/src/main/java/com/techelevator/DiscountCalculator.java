package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");

        String discountAmountFromUser = scanner.nextLine(); //"20"
        double discountAmount = Double.parseDouble(discountAmountFromUser);

        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");

        //capture user input from above
        String pricesFromUser = scanner.nextLine(); // "100, 200, 1000"
        String[] pricesArray = pricesFromUser.split(" ");
        //take prices entered, apply discount and return new discounted prices

        //         for(int i = 0; i < pricesArray.length; i++){
        //            double amountToRemove = ((discountAmount / 100) * Double.parseDouble(pricesArray[i]));
        //            System.out.println(Double.parseDouble(pricesArray[i]) - amountToRemove);

        double[] priceArrayAsDoubles = new double[pricesArray.length];
        //loop over pricesArray
        for(int i = 0; i < pricesArray.length; i++) {
            //put in the values to each instance in array
            priceArrayAsDoubles[i] = Double.parseDouble(pricesArray[i]);
            //convert discountAmountFromUser to decimal value
            double discountAmtDec = discountAmount / 100;
            //mult decimal amount by price
            double amountToRemoveFromPrice = priceArrayAsDoubles[i] * discountAmtDec;
            //subtract amount from price/
            double discountedPrice = priceArrayAsDoubles[i] - amountToRemoveFromPrice;
            System.out.println(discountedPrice);
        }



    }

}