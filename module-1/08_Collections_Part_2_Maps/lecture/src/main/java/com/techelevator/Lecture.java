package com.techelevator;

import java.util.*;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		//build javaPurpleList
		List<String> javaPurpleList = new ArrayList<>();
		javaPurpleList.add("Aaron");
		javaPurpleList.add("Aileen");
		javaPurpleList.add("Andrew");
		javaPurpleList.add("Arthur");
		javaPurpleList.add("Cody");
		javaPurpleList.add("Dan");
		javaPurpleList.add("Reno");
		javaPurpleList.add("Hulya");
		javaPurpleList.add("James");
		javaPurpleList.add("Jimmy");
		javaPurpleList.add("Kat F.");
		javaPurpleList.add("Kat P.");
		javaPurpleList.add("Laura");
		javaPurpleList.add("Mark");
		javaPurpleList.add("Nate");
		javaPurpleList.add("Nife");
		javaPurpleList.add("Sean");
		javaPurpleList.add("William");

		Map<String, String> javaPurpleMap = buildJavaPurpleMap(javaPurpleList);


	}
	private static Map<String,String> buildJavaPurpleMap(List<String> javaPurpleList){
		Map<String, String> javaPurple = new HashMap<>();
		for(String currentStudent : javaPurpleList){
			if(currentStudent.contains("a")){
				javaPurple.put(currentStudent, "coffee");
			} else {
				javaPurple.put(currentStudent, "tea");
			}

		}
		return javaPurple;
	}

}
