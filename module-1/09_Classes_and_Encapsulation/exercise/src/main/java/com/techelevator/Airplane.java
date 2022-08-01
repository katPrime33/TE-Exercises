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

    //derived properties

    public int getAvailableFirstClassSeats(){
        return totalFirstClassSeats - bookedFirstClassSeats;
    }
    public int getAvailableCoachSeats(){
        return totalCoachSeats - bookedCoachSeats;
    }

    //methods

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
        if (forFirstClass == true) {
            if(totalFirstClassSeats - bookedFirstClassSeats >= totalNumberOfSeats) {
                bookedFirstClassSeats += totalNumberOfSeats;
                return true;
            } else{
                return false;
        }

        } else{
            if(totalCoachSeats - bookedCoachSeats >= totalNumberOfSeats){
                bookedCoachSeats += totalNumberOfSeats;
                return true;
            }else{
                return false;
            }
        }
    }




    //getters for member vars

    public String getPlaneNumber(){
        return planeNumber;
    }
    public int getTotalFirstClassSeats(){
        return totalFirstClassSeats;
    }
    public int getBookedFirstClassSeats(){
        return bookedFirstClassSeats;
    }
    public int getTotalCoachSeats () {
        return totalCoachSeats;
    }
    public int getBookedCoachSeats(){
        return bookedCoachSeats;
    }


}
