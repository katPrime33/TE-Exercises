package com.techelevator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(System.in);
		System.out.println("What is the destination file?");
		String destinationFilePath = input.nextLine();

		File destinationFile = new File(destinationFilePath);

		String output;
		try(PrintWriter dataOutput = new PrintWriter(destinationFile)){
			for(int i = 1; i <= 300; i++){
				if(i % 3 == 0 || Integer.toString(i).contains("3")){
					output = "Fizz";
				} else if(i % 5 == 0 || Integer.toString(i).contains("5")){
					output = "Buzz";
				} else if(i % 15 == 0) {
					output = "FizzBuzz";
				}else{
					output = Integer.toString(i);
				}
				dataOutput.println(output);
			}
		}
	}

}
