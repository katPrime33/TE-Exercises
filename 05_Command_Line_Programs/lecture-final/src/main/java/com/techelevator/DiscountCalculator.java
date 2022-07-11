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
        int discountAmount = Integer.parseInt(discountAmountFromUser);

        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");

        //capture user input from above
        String pricesFromUser = scanner.nextLine(); // "100 200 1000"
        String[] pricesArray = pricesFromUser.split(" ");
        //take prices entered, and apply discount and return new discounted prices
        





    }

}