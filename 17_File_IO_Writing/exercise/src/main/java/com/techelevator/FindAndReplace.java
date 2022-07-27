package com.techelevator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) throws IOException {


        FindAndReplace app = new FindAndReplace();
        Scanner userInput = new Scanner(System.in);

            System.out.println("What is the search word?");
            String wordToBeSearched = userInput.nextLine();

            System.out.println("What is the replacement word?");
            String replacementWord = userInput.nextLine();

            System.out.println("What is the source file?");
            String pathToSourceFile = userInput.nextLine();

            System.out.println("What is the destination file?");
            String pathToDestinationFile = userInput.nextLine();

            try{
                app.fileReadAndReplace(wordToBeSearched, replacementWord, pathToSourceFile, pathToDestinationFile);
            } catch(IOException ex){
                ex.printStackTrace();
            }
    }

    public void fileReadAndReplace(String wordToBeSearched, String replacementWord, String pathToSourceFile, String pathToDestinationFile)
        throws IOException{
        File file = new File(pathToSourceFile);
        Scanner sourceFile = new Scanner(file);
        List<String> fileList = new ArrayList<>();

        while(sourceFile.hasNextLine()){
            String lineOfText = sourceFile.nextLine();
            if(lineOfText.contains(wordToBeSearched)){
                String newLine = lineOfText.replaceAll(wordToBeSearched, replacementWord);
                fileList.add(newLine + "\r\n");
            } else {
                fileList.add(lineOfText + "\r\n");
            }
        }
        String destination = String.join("",fileList);

        try(PrintWriter out = new PrintWriter((new BufferedWriter(new FileWriter(pathToDestinationFile, false))))){
            out.println(destination);
        }
    }

}
