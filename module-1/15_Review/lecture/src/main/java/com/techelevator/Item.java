package com.techelevator;

import java.math.BigDecimal;

public abstract class Item {

    private double price;
    private String name;
    private String description;
    private String sku;
    private boolean isPerishable;
    private boolean isTaxable;
    private BigDecimal taxToAdd;

    //constructor
    public Item(String sku) {
        this.sku = sku;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BigDecimal getTaxToAdd(){
        BigDecimal taxToAdd = new BigDecimal(getPrice() * 0.07);
        return taxToAdd;
    }

    public void setTaxAmount(BigDecimal taxToAdd){
        this.taxToAdd = taxToAdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSku() {
        return sku;
    }


    public boolean isPerishable() {
        return isPerishable;
    }

    public boolean isTaxable(){
        return isTaxable;
    }

    public void setPerishable(boolean perishable) {
        isPerishable = perishable;
    }

    public void setTaxable(boolean taxable){
        isTaxable = taxable;
    }
}
