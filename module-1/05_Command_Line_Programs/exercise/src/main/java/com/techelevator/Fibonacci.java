package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Fibonacci Generator!");
		System.out.println("Please enter a number: ");
		String numberEnteredByUser = input.nextLine();
		int targetNumber = Integer.parseInt(numberEnteredByUser);
		int firstTerm = 0;
		int secondTerm = 1;

		//referenced programiz.com for how to set up while loop
		while(firstTerm <= targetNumber){
			System.out.println(firstTerm + ", ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}




	}

}
