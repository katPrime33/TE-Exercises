package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonStartTest {

    @Test
    public void return_string_minus_first_char(){
        //Arrange
        NonStart nonStart = new NonStart();
        //Act
        String partialString = nonStart.getPartialString("Hello", "Ladies");
        //Assert
        Assert.assertEquals("elloadies", partialString);
    }

    @Test
    public void return_second_string_if_first_string_is_empty(){
        //Arrange
        NonStart nonStart = new NonStart();
        //Act
        String partialString = nonStart.getPartialString("", "Chimney");
        //Assert
        Assert.assertEquals("himney", partialString);
    }

    @Test
    public void return_first_string_if_second_string_is_empty(){
        //Arrange
        NonStart nonStart = new NonStart();
        //Act
        String partialString = nonStart.getPartialString("Beach", "");
        //Assert
        Assert.assertEquals("each", partialString);
    }
}
