package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	//m = f * 0.3048
	//f = m * 3.2808399

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//construct program to convert meters to feet and vice versa
		System.out.println("Welcome to the Linear Converter");

		//prompt user to enter integer as feet or meters
		System.out.println("Please enter the length: ");
		String lengthEnteredByUser = input.nextLine();
		int lengthEntered = Integer.parseInt(lengthEnteredByUser);

		//Prompt user to determine if length is (F)eet or (M)eters
		System.out.println("Is the measurement in (F)eet or in (M)eters?");
		lengthEnteredByUser = input.nextLine();

		//take length entered by user and convert to other measurement type
		if(lengthEnteredByUser.equalsIgnoreCase("F")){
			double lengthFromFToM = lengthEntered * 0.3048;
			System.out.println(lengthFromFToM);
		} else {
			double lengthFromMToF = lengthEntered * 3.2808399;
			System.out.println(lengthFromMToF);
		}

	}

}
