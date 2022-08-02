package com.techelevator;

public class MovieRental {

    private String title;
    private String format;
    private boolean isPremiumMovie;
    private double rentalPrice;

    public MovieRental(String title, String format, boolean isPremiumMovie) {
        this.title = title;
        this.format = format;
        this.isPremiumMovie = isPremiumMovie;

        if(this.format == "VHS"){
            this.rentalPrice = 0.99;
        }
        else if(this.format == "DVD"){
            this.rentalPrice = 1.99;
        }
        else{
            this.rentalPrice = 2.99;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public boolean isPremiumMovie() {
        return isPremiumMovie;
    }

    public void setPremiumMovie(boolean premiumMovie) {
        isPremiumMovie = premiumMovie;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public double calculateLateFee(int daysLate){
        double lateFee = 0;
        if(daysLate <= 0){
            lateFee = 0;
        }
        else if(daysLate == 1){
            lateFee = 1.99;
        }
        else if(daysLate == 2){
            lateFee = 3.99;
        }
        else{
            lateFee = 19.99;
        }

        return lateFee;
    }

    public String toString(){
        String movieTitle = getTitle();
        String movieFormat = getFormat();
        boolean premium = isPremiumMovie();
        double rentalPrice = getRentalPrice();
        return "MOVIE - " + movieTitle + " - " + movieFormat + " " + rentalPrice;
    }

}
