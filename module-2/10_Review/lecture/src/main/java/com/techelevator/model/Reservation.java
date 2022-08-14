package com.techelevator.model;

public class Reservation {

    private int reservationId;
    private int numberOfAttendees;
    private String reservedFor;

    public int getReservationId(){
        return reservationId;
    }

    public void setReservationId(int reservationId){
        this.reservationId = reservationId;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public String getReservedFor() {
        return reservedFor;
    }

    public void setReservedFor(String reservedFor) {
        this.reservedFor = reservedFor;
    }
}
