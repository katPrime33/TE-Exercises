package com.techelevator;

import java.math.BigDecimal;

public class FlowerShop {
    //attributes or properties
    private String bouquetType;
    private int numberOfRoses;
    //private BigDecimal will be derived property for subtotal

    public FlowerShop(String bouquetType, int numberOfRoses) {
        this.bouquetType = bouquetType;
        this.numberOfRoses = numberOfRoses;
    }

    public String getBouquetType() {
        return bouquetType;
    }

    public void setBouquetType(String bouquetType) {
        this.bouquetType = bouquetType;
    }

    public int getNumberOfRoses() {
        return numberOfRoses;
    }

    public void setNumberOfRoses(int numberOfRoses) {
        this.numberOfRoses = numberOfRoses;
    }

    public BigDecimal deliveryTotal (boolean sameDayDelivery, String zipCode){
        BigDecimal delivery = new BigDecimal("0.00");
        if (zipCode.startsWith("2")) {
            delivery = delivery.add(new BigDecimal("3.99"));
            if(sameDayDelivery){
                delivery = delivery.add(new BigDecimal("5.99"));
            }
        } else if(zipCode.startsWith("3")){
            delivery = delivery.add(new BigDecimal("6.99"));
            if(sameDayDelivery){
                delivery = delivery.add(new BigDecimal("5.99"));
            } else if(zipCode.startsWith("1")){
                return delivery;
            }
        } else{
            delivery = delivery.add(new BigDecimal("19.99"));
        }
        return delivery;
    }

    public BigDecimal getSubTotal() {
        BigDecimal subTotal = new BigDecimal("19.99");
        BigDecimal pricePerRose = new BigDecimal("2.99");
        BigDecimal totalRosePrice = pricePerRose.multiply(new BigDecimal(this.numberOfRoses));
        subTotal = subTotal.add(pricePerRose.multiply(totalRosePrice));
        return subTotal;
    }

    @Override
    public String toString(){
        return "ORDER - " + this.bouquetType + " - " + this.numberOfRoses + " - " + getSubTotal();
    }

}
