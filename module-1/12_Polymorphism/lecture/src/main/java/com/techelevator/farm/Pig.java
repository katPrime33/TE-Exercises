package com.techelevator.farm;

public class Pig extends FarmAnimal{
    public Pig(){
        super("Pig");
    }


    @Override
    public String getSound(){
        return "oink!";
    }
}
