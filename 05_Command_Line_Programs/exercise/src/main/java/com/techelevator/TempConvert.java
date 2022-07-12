package com.techelevator;

import java.util.Scanner;

public class TempConvert {


//	final double temperatureCelsius = (temperatureFahrenheit - 32) / 1.8;
//	final double temperatureFahrenheit = temperatureCelsius * 1.8 + 32;


	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Temperature Converter");

		//prompt user to enter temp
		//the answer needs to be saved as an integer
		System.out.println("Please enter the temperature: ");
		String tempEnteredByUser = input.nextLine();
		int tempEntered = Integer.parseInt(tempEnteredByUser);

		//prompt user to determine whether Fahrenheit or Celsius
		System.out.println("Is this (F)ahrenheit or (C)elsius: ");
		tempEnteredByUser = input.nextLine();
		//take temp entered and convert to other temp measurement
			if(tempEnteredByUser.equalsIgnoreCase("C")){
				double tempFromCToF = tempEntered * 1.8 + 32;
				System.out.println(tempFromCToF);
			} else {
				double tempFromFToC = (tempEntered - 32) / 1.8;
				System.out.println(tempFromFToC);
			}


	}


}