package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FlowerShopTest {

    @Test
    public void deliveryTotal_sameDay_false_and_zipCode_20000_returns3_99() {
        //Arrange
        FlowerShop flowerShop = new FlowerShop("string", 1);
        BigDecimal expected = new BigDecimal("3.99");
        //Act
        BigDecimal actual = flowerShop.deliveryTotal(false, "20000");
        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void delivery_total_sameDay_true_and_zipCode_20000_returns9_98(){
        //Arrange
        FlowerShop flowerShop = new FlowerShop("string", 1);
        BigDecimal expected = new BigDecimal("9.98");
        //Act
        BigDecimal actual = flowerShop.deliveryTotal(true, "20000");
        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deliveryTotal_sameDay_false_and_zipCode_30000_returns6_99() {
        //Arrange
        FlowerShop flowerShop = new FlowerShop("string", 1);
        BigDecimal expected = new BigDecimal("6.99");
        //Act
        BigDecimal actual = flowerShop.deliveryTotal(false, "30000");
        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void delivery_total_sameDay_true_and_zipCode_30000_returns12_98() {
        //Arrange
        FlowerShop flowerShop = new FlowerShop("string", 1);
        BigDecimal expected = new BigDecimal("12.98");
        //Act
        BigDecimal actual = flowerShop.deliveryTotal(true, "30000");
        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void delivery_total_sameDay_false_and_zipCode_10000_returns_0() {
        //Arrange
        FlowerShop flowerShop = new FlowerShop("string", 1);
        BigDecimal expected = new BigDecimal("0.00");
        //Act
        BigDecimal actual = flowerShop.deliveryTotal(false, "10000");
        //Assert
        Assert.assertEquals(expected, actual);
    }

//        @Test
//        public void getSubTotal(){
//        }
    }
