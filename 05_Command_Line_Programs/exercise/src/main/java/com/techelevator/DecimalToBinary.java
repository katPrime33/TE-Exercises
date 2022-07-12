package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	//two sep loops

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//prompt the user to enter a series of decimal values, separated by spaces
		System.out.println("Welcome to the Decimal to Binary Converter");

		System.out.println("Please enter in a series of decimal values (separated by spaces):");
		String numbersFromUser = input.nextLine();
		String[] decimalArray = numbersFromUser.split(" ");


		//take decimal values entered and convert them to binary
		int[] decimalArrayAsInts = new int[decimalArray.length];
		//loop over decimalArray

			//conversion method
			//divide given number by 2 and note the remainder
			//now divide the obtained quotient by 2 and note remainder again
			//repeat steps above until the quotient = 0

		}
	}


