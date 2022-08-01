package com.techelevator.vehicle;

public class Bus {
    //write member variables


    private int numOfPassengers;
    private boolean isDoorOpen = false;
    private int gallonsOfGas = 50;
    private String routeName;

    private static final int NUMBER_OF_SEATS = 40;


    //this constructor requires a String for the route - so we overload the constructor
    public Bus(String routeName){
        this.routeName = routeName;
    }


    //because we added a constructor, we no longer have the default constructor
    //so we add an empty one / no argument constructor
    public Bus(){

    }

    //getters and setters

    public String getRouteName(){
        return this.routeName;
    }

    public void setRouteName(String routeName){
        this.routeName = routeName;
    }

    public boolean isDoorOpen(){
        return isDoorOpen;
    }

    public int getGallonsOfGas(){
        return this.gallonsOfGas;
    }

    //derived property of getRemainingSeats that is based off of seatsOnBus - numOfPassengers

    public int getRemainingSeats(){
        return NUMBER_OF_SEATS - numOfPassengers;
    }

    //what a bus can do - methods

    public void addGas(int gallonsOfGas){
        this.gallonsOfGas += gallonsOfGas;
    }

    public void openDoor(){
        //maybe we have some qualifiers before we try to open door
        //like is bus stopped
        this.isDoorOpen = true;
    }

    public void closeDoor(){
        //maybe we would have some qualifiers before we try to close door
        this.isDoorOpen = false;
    }





}
