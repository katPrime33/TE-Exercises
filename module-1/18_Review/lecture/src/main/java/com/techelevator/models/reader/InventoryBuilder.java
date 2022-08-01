package com.techelevator.models.reader;

import com.techelevator.models.inventory.Clothing;
import com.techelevator.models.inventory.Food;
import com.techelevator.models.inventory.Homegood;
import com.techelevator.models.inventory.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryBuilder {


    public Map<String, Item> getInventory() {



        Map<String, Item> inventory = new HashMap<String, Item>();

        File fileToRead = new File("inventory.csv");

        try(Scanner fileScanner = new Scanner(fileToRead)){
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
               String[] newInventory = line.split("\\|");
               Item item;
               if(newInventory[4].equals("F")){
                   item = new Food(newInventory[0]);
               } else if(newInventory[4].equals("C")){
               item = new Clothing(newInventory[0]);
               } else {
                   item = new Homegood(newInventory[0]);
               }
               item.setName(newInventory[1]);
               item.setDescription(newInventory[2]);
               BigDecimal price = new BigDecimal(newInventory[3]);
               price.setScale(2, RoundingMode.HALF_UP);
               item.setPrice(price);

               inventory.put(newInventory[0], item);
            }
        }
        catch(FileNotFoundException ex) {
            System.out.println("Your file was invalid or does not exist.");
        }

        return inventory;
    }
}
