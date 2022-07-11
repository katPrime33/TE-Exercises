package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Temperature Convertor");

		//prompt user to enter temp
		//the answer needs to be saved as an integer
		System.out.println("Please enter the temperature: ");

		String tempEnteredByUser = input.nextLine();
		int tempEntered = Integer.parseInt(tempEnteredByUser);

		//prompt user to determine whether Fahrenheit or Celsius
		System.out.println("Is this (F)ahrenheit or (C)elsius: ");

		//Capture input from user
		String tempFromUser = input.nextLine();
		String[] tempArray = tempFromUser.split(" ");
		//take temp entered and convert to other temp measurement

	}

}
