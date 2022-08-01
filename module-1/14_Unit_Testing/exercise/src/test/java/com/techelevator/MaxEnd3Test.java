package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxEnd3Test {

    MaxEnd3 maxEnd3 = new MaxEnd3();

    @Test
    public void return_largest_element_between_first_and_last_element_in_array90(){

        int[] testArray = {11, 5, 9};
        int[] expectedArray = {11, 11, 11};
        int[]  returnArray = maxEnd3.makeArray(testArray);

        Assert.assertArrayEquals(expectedArray, returnArray);
    }

    @Test
    public void return_largest_element_between_first_and_last_of_array(){

        int[] testArray = {1, 2, 3};
        int[] expectedArray = {3, 3, 3};
        int[] returnArray = maxEnd3.makeArray(testArray);

        Assert.assertArrayEquals(expectedArray, returnArray);
    }
}
