package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {

    @Test
    public void test_to_see_if_first_and_last_element_are_equal(){
        //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();
        //Act
        int[] numbers00 = {1, 2, 4, 1};
        int[] numbers01 = {1};
        int[] numbers02 = {1, 2, 3, 4};
        int[] numbers03 = {5, 5};
        int[] numbers04 = {};
        //Assert
        Assert.assertTrue(sameFirstLast.isItTheSame(numbers00));
        Assert.assertTrue("Returns true for nums01.length being 1 or more", sameFirstLast.isItTheSame(numbers01));
        Assert.assertFalse(sameFirstLast.isItTheSame(numbers02));
        Assert.assertTrue(sameFirstLast.isItTheSame(numbers03));
        Assert.assertFalse("Should return error, answer is False", sameFirstLast.isItTheSame(numbers04));

    }
}
