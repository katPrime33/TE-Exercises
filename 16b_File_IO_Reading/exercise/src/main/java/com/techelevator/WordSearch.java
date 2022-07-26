package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner userInput = new Scanner(System.in);

		System.out.println("What is the file that should be searched?");
		String filePath = userInput.nextLine();

		System.out.println("What word would you like to search for?");
		//save user input
		String wordToBeSearched = userInput.nextLine();

		System.out.println("Should the search be case sensitive? (Y/N)");
		String isItSensitive = userInput.nextLine();

		int lineCount = 1;
		boolean caseSensitivity = false;

		if(isItSensitive.equals("Y")){
			caseSensitivity = true;
		} else if(isItSensitive.equals("N")){
			caseSensitivity = false;
		}
		File inputFile = new File(filePath);
		Scanner fileScanner = new Scanner(inputFile);
		while(fileScanner.hasNextLine()){
			String nextLineFromFile = fileScanner.nextLine();
			if(caseSensitivity&& nextLineFromFile.contains((wordToBeSearched))){
				System.out.println(lineCount + ": " + nextLineFromFile);
			}
			else if(!caseSensitivity && nextLineFromFile.toLowerCase().contains(wordToBeSearched.toLowerCase())){
				System.out.println(lineCount + ": "+ nextLineFromFile);
			}
			lineCount++;
		}
		userInput.close();
		fileScanner.close();

	}

}
