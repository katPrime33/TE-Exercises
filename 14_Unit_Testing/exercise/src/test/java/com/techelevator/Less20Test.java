package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {

    @Test
    public void number_is_one_less_than_a_multiple_of_20(){
        //Arrange
        Less20 less20 = new Less20();
        //Act
        boolean oneLess = less20.isLessThanMultipleOf20(38);
        //Assert
        Assert.assertTrue(oneLess);
    }

    @Test
    public void number_is_two_less_than_a_multiple_of_20(){
        //Arrange
        Less20 less20 = new Less20();
        //Act
        boolean twoLess = less20.isLessThanMultipleOf20(39);
        //Assert
        Assert.assertTrue(twoLess);
    }

    @Test
    public void number_is_perfect_multiple_of_20(){
        //Arrange
        Less20 less20 = new Less20();
        //Act
        boolean perfectMultiple = less20.isLessThanMultipleOf20(20);
        //Assert
        Assert.assertFalse(perfectMultiple);
    }
}
