package com.techelevator;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) throws FileNotFoundException {

		try(Scanner userInput = new Scanner(System.in)) {

			File sourceFile;

			System.out.println("Where is the input file (please include path to file)?");
			String path = userInput.nextLine();

			sourceFile = new File(path);
			if(!sourceFile.exists()){
				System.out.println(path + " is invalid or does not exist. Please try again.");
				System.exit(1);
			} else if(!sourceFile.isFile()){
				System.out.println(path + " is not a valid file or does not exist. Please try again.");
				System.exit(1);
			}

			System.out.println("How many lines of text (max) should there be in the split files?");
			int maxLineCount = userInput.nextInt();

			String destinationPath = sourceFile.getAbsoluteFile().getParent();
			String destinationFilename = sourceFile.getAbsoluteFile().getName();
			String destinationExtension = "";

			if(destinationFilename.contains(".")){
				int lastPeriod = destinationFilename.lastIndexOf(".");
				destinationExtension = destinationFilename.substring(lastPeriod);
				destinationFilename = destinationFilename.substring(0, lastPeriod);
			}

			Queue<String> linesInFile = new LinkedList<String>();
			try(Scanner sourceScanner = new Scanner(sourceFile.getAbsoluteFile())){
				while(sourceScanner.hasNextLine()){
					String line = sourceScanner.nextLine();
					linesInFile.offer(line);
				}
			}

			int numberOfLinesInFile = linesInFile.size();
			int numberOfFilesToCreate = (int) Math.ceil((double) numberOfLinesInFile / maxLineCount);

			System.out.println(String.format("The input file had %d lines of text." +
					System.lineSeparator(), numberOfLinesInFile));
			System.out.println("Each file that is created should a sequential number assigned to it." +
					System.lineSeparator());
			System.out.println(String.format("For a %d line input file \"%s%s\" this will produce %d output files." +
					System.lineSeparator(), numberOfLinesInFile, destinationFilename, destinationExtension, numberOfFilesToCreate));
			System.out.println("**GENERATING OUTPUT**" + System.lineSeparator());

			for(int currentFileNumber = 1; currentFileNumber <= numberOfFilesToCreate; currentFileNumber++){
				String currentFileName = destinationFilename + "-" + currentFileNumber + destinationExtension;
				System.out.println(currentFileName);

				File destinationFile = new File(destinationPath + File.separatorChar + currentFileName);

				try(PrintWriter destinationWriter = new PrintWriter(destinationFile)){
					for(int lineNumber = 0; !linesInFile.isEmpty() && lineNumber < maxLineCount; lineNumber++){
						destinationWriter.println(linesInFile.poll());
					}
				}
			}
			System.out.println();
		} catch(FileNotFoundException ex){
			System.out.println(ex.getMessage());
		}
	}
}
