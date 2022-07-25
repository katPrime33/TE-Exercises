package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringBitsTest {

    private StringBits stringBits;

    @Before
    public void setup(){
        stringBits = new StringBits();
    }

    @Test
    public void getBits_returns_new_string_of_every_other_char_starting_with_first(){
        //Arrange in before
        //Act/Assert
        Assert.assertEquals("Testing first case: ", "Hlo", stringBits.getBits("Hello"));
        Assert.assertEquals("Testing second case: ", "H", stringBits.getBits("Hi"));
        Assert.assertEquals("Testing third case: ", "Hello", stringBits.getBits("Heeololeo"));
    }
}
