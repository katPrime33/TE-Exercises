package com.techelevator;

import java.beans.beancontext.BeanContext;
import java.math.BigDecimal;

public class HotelReservation {

    private String name;
    private int numOfNights;
    boolean requiresCleaning;
    boolean usedMinibar;
    //estimated total will be derived property

    public HotelReservation(String name, int numOfNights){
        this.name = name;
        this.numOfNights = numOfNights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public boolean isRequiresCleaning() {
        return requiresCleaning;
    }

    public void setRequiresCleaning(boolean requiresCleaning) {
        this.requiresCleaning = requiresCleaning;
    }

    public boolean isUsedMinibar() {
        return usedMinibar;
    }

    public void setUsedMinibar(boolean usedMinibar) {
        this.usedMinibar = usedMinibar;
    }

    //if minibar was used add $12.99 to estimated total
    //if requiresCleaning is true add $34.99 to estimated total
    //if minibar was used-double the cleaning fee ($69.98)
    public BigDecimal calculateEstimatedTotal() {
        BigDecimal nightlyRate = new BigDecimal("59.99");
        BigDecimal minibarFee = new BigDecimal("12.99");
        BigDecimal cleaningFee = new BigDecimal("34.99");


        BigDecimal estimatedTotal = new BigDecimal("0.00");
        if (requiresCleaning) {
            estimatedTotal = estimatedTotal.add(cleaningFee);
        } else if (usedMinibar) {
            estimatedTotal = estimatedTotal.add(minibarFee).add(cleaningFee.multiply(BigDecimal.valueOf(2)));
        } else {
            estimatedTotal = nightlyRate.multiply(BigDecimal.valueOf((numOfNights)));
        }
        return estimatedTotal;
    }

    @Override
    public String toString(){
        return "RESERVATION - " + this.name + " - " + calculateEstimatedTotal();
    }
}
