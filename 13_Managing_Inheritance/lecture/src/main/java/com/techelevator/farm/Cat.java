package com.techelevator.farm;

public class Cat extends FarmAnimal{

    public Cat(String name, String sound){
        super(name, sound);
    }

//    public String getSound(){
  //      return "Meow";
    //}
    public String eat(){
        return "Eating cat food.....";
    }
}
