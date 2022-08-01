package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Which file contains the quiz?");
		String filePath = userInput.nextLine();
		System.out.println();

		File inputFile = new File(filePath);
		Scanner fileScanner = new Scanner(inputFile);
		int correct = 0;
		int total = 0;

		while (fileScanner.hasNextLine()) {
			String questions[] = fileScanner.nextLine().split("\\|");
			String correctAnswer = "";
			String question = questions[0];
			String answerA = questions[1];
			if (answerA.charAt(answerA.length() - 1) == '*') {
				answerA = answerA.substring(0, answerA.length() - 1);
				correctAnswer = "A";
			}
			String answerB = questions[2];
			if (answerB.charAt(answerB.length() - 1) == '*') {
				answerB = answerB.substring(0, answerB.length() - 1);
				correctAnswer = "B";
			}
			String answerC = questions[3];
			if (answerC.charAt(answerC.length() - 1) == '*') {
				answerC = answerC.substring(0, answerC.length() - 1);
				correctAnswer = "C";
			}
			String answerD = questions[4];
			if (answerD.charAt(answerD.length() - 1) == '*') {
				answerD = answerD.substring(0, answerD.length() - 1);
				correctAnswer = "D";
			}
			System.out.println("Question: " + question);
			System.out.println("A. " + answerA);
			System.out.println("B. " + answerB);
			System.out.println("C. " + answerC);
			System.out.println("D. " + answerD);
			System.out.println();
			System.out.println("What is your answer? ");
			String userAnswer = userInput.nextLine();

			if (userAnswer.toLowerCase().equals(correctAnswer.toLowerCase())) {
				System.out.println("Correct!");
				correct++;
				total++;
			} else {
				System.out.println("Incorrect!");
				total++;

			}
			System.out.println();

		}
		System.out.println("Out of " + total + " questions, you got " + correct + " correct!");
		int grade = ((correct * 100) / total);
		String letterGrade = "";
		if (grade == 100) {
			letterGrade = "n A+";
		} else if (grade <= 90) {
			letterGrade = "n A";
		} else if (grade <= 80) {
			letterGrade = " B";
		} else if (grade <= 70) {
			letterGrade = " C";
		} else if (grade >= 60) {
			letterGrade = " D";
		} else {
			letterGrade = "n F. :( ";
		}
		System.out.println("That's a " + grade + "% so you get a" + letterGrade);

		fileScanner.close();
		userInput.close();
	}

}
