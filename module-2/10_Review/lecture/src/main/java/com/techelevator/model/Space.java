package com.techelevator.model;

import java.math.BigDecimal;

public class Space {

    private int spaceId;
    private String spaceName;
    private int openFrom;
    private int openTo;
    private BigDecimal dailyRate;
    private boolean isAccessible;
    private int maxOccupancy;

    public int getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(int spaceId) {
        this.spaceId = spaceId;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    public int getOpenFrom() {
        return openFrom;
    }

    public void setOpenFrom(int openFrom) {
        this.openFrom = openFrom;
    }

    public int getOpenTo() {
        return openTo;
    }

    public void setOpenTo(int openTo) {
        this.openTo = openTo;
    }

    public BigDecimal getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(BigDecimal dailyRate) {
        this.dailyRate = dailyRate;
    }

    public boolean isAccessible() {
        return isAccessible;
    }

    public void setAccessible(boolean accessible) {
        isAccessible = accessible;
    }

    public int getMaxOccupancy(){
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy){
        this.maxOccupancy = maxOccupancy;
    }
}
