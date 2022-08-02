package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileReader {

        //create file Object
        File movieFile = new File("MovieInput.csv");

        try(Scanner fileReader = new Scanner(movieFile)) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
            }
        }
}
