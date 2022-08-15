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

		HotelReservation newReservation = new HotelReservation("Kat ", 5);

		System.out.println("RESERVATION " + " - " + newReservation.getName() + " - $" +
				newReservation.calculateEstimatedTotal());

		// File I/O

		File file = new File("data-files/HotelInput.csv");
		List<HotelReservation> hotelReservations = new ArrayList<>();
		try{
			Scanner fileInput = new Scanner(file);
			while(fileInput.hasNextLine()){
				String[] line = fileInput.nextLine().trim().split(",");
				HotelReservation temp = new HotelReservation(line[0], Integer.parseInt(line[1]));
				hotelReservations.add(temp);
			}
		} catch(FileNotFoundException ex){
			ex.printStackTrace();
		}

		BigDecimal total = new BigDecimal("0.00");
		for(HotelReservation reservation : hotelReservations){
			total = total.add(reservation.calculateEstimatedTotal());
		}
		System.out.println(" *** TOTAL *** " + total);
	}

}
