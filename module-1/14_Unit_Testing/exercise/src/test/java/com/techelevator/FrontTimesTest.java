package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrontTimesTest {

    private FrontTimes times;

    @Before
    public void setup() {
        times = new FrontTimes();
    }

    @Test
    public void generateString_given_empty_string_returns_empty_string(){
        //Arrange
        FrontTimes times = new FrontTimes();
        String string = "";
        //Act
        String input = times.generateString(string, 3);
        //Assert
        Assert.assertEquals("", input);
    }

    @Test
    public void generateString_given_negative_int_returns_empty_string(){
        //Arrange
        FrontTimes times = new FrontTimes();
        int n = -3;
        //Act
        String input = times.generateString("Chocolate", n);
        //Assert
        Assert.assertEquals("", input);
    }

    @Test
    public void generateString_int_two_returns_first_three_two_times(){
        //Arrange
        FrontTimes times = new FrontTimes();
        int n = 2;
        String string = "Chocolate";
        //Act
        String input = times.generateString(string, n);
        //Assert
        Assert.assertEquals("ChoCho", input);
    }

    @Test
    public void generateString_int_three_returns_first_three_three_times(){
        //Arrange
        FrontTimes times = new FrontTimes();
        int n = 3;
        String string = "Abc";
        //Act
        String input = times.generateString(string, n);
        //Assert
        Assert.assertEquals("AbcAbcAbc", input);
    }

    @Test
    public void generateString_string_shorter_than_three_returns_entire_string_int_times(){
        //Arrange
        FrontTimes times = new FrontTimes();
        int n = 5;
        String string = "Ha";
        //Act
        String input = times.generateString(string, n);
        //Assert
        Assert.assertEquals("HaHaHaHaHa", input);
    }

}
