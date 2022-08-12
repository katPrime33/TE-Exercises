package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FlowerShop flowerShop = new FlowerShop("Valentine's Day Bouquet", 100);

		FlowerShop katsOrder = new FlowerShop("Kat's Birthday Bouquet", 12);

		System.out.println("Type: " + flowerShop.getBouquetType() + " " +
				"Number of roses in bouquet: " + flowerShop.getNumberOfRoses());
		System.out.println("Subtotal: $" + flowerShop.getSubTotal());
		System.out.println("Type: " + katsOrder.getBouquetType() + " " +
				"number of roses in bouquet: " + katsOrder.getNumberOfRoses());
		System.out.println("Subtotal: $" + katsOrder.getSubTotal());

		System.out.println();

		//File I/O

		File file = new File("data-files/FlowerInput.csv");
		List<FlowerShop> flowerShops = new ArrayList<>();
		try{
			Scanner fileInput = new Scanner(file);
			System.out.println("File open");
			while(fileInput.hasNextLine()){
				String[] line = fileInput.nextLine().trim().split(",");
				FlowerShop temp = new FlowerShop(line[0], Integer.parseInt(line[1]));
				flowerShops.add(temp);
			}
		} catch (FileNotFoundException ex){
			ex.printStackTrace();
		}

		BigDecimal total = new BigDecimal("0.00");
		for(FlowerShop order : flowerShops){
			total = total.add(order.getSubTotal());
		}
		System.out.println(" *** TOTAL *** " + total);
	}

}
