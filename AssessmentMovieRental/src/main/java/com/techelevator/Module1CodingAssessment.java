package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) {

		File inFile = new File("MovieInput.csv");
		String line;
		String[] lineItem;

		MovieRental movie = new MovieRental("Dances with Wolves", "VHS", false);
		List<MovieRental> rentalList = new ArrayList<>();

		try(Scanner inFileScanner = new Scanner(inFile)){

			while(inFileScanner.hasNext()) {
				line = inFileScanner.nextLine();
				System.out.println(line);
				lineItem = line.split(",");
				System.out.println(lineItem[0]);
				
				MovieRental tempMovie = new MovieRental(lineItem[0], lineItem[1], lineItem[2]);
				rentalList.add(tempMovie)
			}
		}
		catch(FileNotFoundException e){
			System.out.println("Failure to load.");
		}

		System.out.println(movie.toString());
		// TODO Auto-generated method stub

	}

}
