package com.techelevator;

import java.math.BigDecimal;

public abstract class Movie {
    private String title;
    private String format;
    private boolean isPremiumMovie;
    private BigDecimal rentalPrice;

    //constructor
    public Movie(String title, String format, boolean isPremiumMovie){
        this.title = title;
        this.format = format;
        this.isPremiumMovie = isPremiumMovie;
    }

    public String getTitle() {
        return title;
    }

    public String getFormat() {
        return format;
    }

    public boolean isPremiumMovie() {
        return isPremiumMovie;
    }

    public BigDecimal getRentalPrice() {
        return rentalPrice;
    }
}
