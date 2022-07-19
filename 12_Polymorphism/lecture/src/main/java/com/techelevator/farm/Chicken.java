package com.techelevator.farm;

public class Chicken extends FarmAnimal {

	public Chicken() {
		super("Chicken");
	}

	public void layEgg() {
		System.out.println("Chicken laid an egg!");
	}

	@Override
	public String getSound(){
		return "cluck!";
	}

}