package com.techelevator;

public class Airplane {

    //member vars

    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;


    //constructor

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }
    public Airplane(){

    }

    //methods




    //getters for member vars

    public String getPlaneNumber(){
        return this.planeNumber;
    }
    public int getTotalFirstClassSeats(){
        return this.getTotalFirstClassSeats();
    }
    public int getTotalCoachSeats (){
        return this.getTotalCoachSeats();
    }


}
