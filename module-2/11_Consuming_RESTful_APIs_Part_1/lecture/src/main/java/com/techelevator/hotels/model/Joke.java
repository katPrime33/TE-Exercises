package com.techelevator.hotels.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Joke {
    @JsonProperty("category")
    private String type;
    private String category;
    private String setup;
    private String delivery;
    private int id;

    public String getType(){
        return type;
    }
    public void setType(){
        this.type = type;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public void setId(int id){
        this.id = id;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getCategory() {
        return category;
    }

    public int getId() {
        return id;
    }
    public String getSetup(){
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getDelivery() {
        return delivery;
    }

    @Override
    public String toString(){
        if(type == "twopart"){
            return setup + delivery;
        }else if(type == "joke"){
            return null;
        }
        return null;
    }
}
