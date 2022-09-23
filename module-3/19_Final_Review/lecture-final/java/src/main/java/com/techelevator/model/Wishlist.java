package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class Wishlist {

    private long id;
    private String name;
    private long userId;
    private int countOfProducts;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Product> products;

    public long getId() {
        return id;
    }

    public int getCountOfProducts() {
        return countOfProducts;
    }

    public void setCountOfProducts(int countOfProducts) {
        this.countOfProducts = countOfProducts;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> wishlists) {
        this.products = wishlists;
    }
}
