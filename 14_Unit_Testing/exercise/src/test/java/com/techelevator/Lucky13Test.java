package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lucky13Test {

    private Lucky13 lucky13;

    @Before
    public void setup(){
        lucky13 = new Lucky13();
    }

    @Test
    public void expect_true_when_null_is_passed(){
        //Arrange in @Before
        //Act
        Lucky13 lucky13 = new Lucky13();
        //Assert
        Assert.assertEquals(true,lucky13.getLucky(null));
    }

    @Test
    public void expect_true_when_array_contains_no_1s_or_0s(){
        //Arrange in @Before
        //Act

        //Assert
        Assert.assertEquals(true, lucky13.getLucky(new int[]{0, 2, 4}));
        Assert.assertEquals(true, lucky13.getLucky(new int[]{}));
    }

    @Test
    public void expect_false_when_array_contains_all_1s_or_0s(){
        //Arrange in @Before
        //Act

        //Assert
        Assert.assertEquals(false, lucky13.getLucky(new int[]{1, 1, 1 }));
        Assert.assertEquals(false, lucky13.getLucky(new int[]{3, 3, 3}));
        Assert.assertEquals(false, lucky13.getLucky(new int[]{1, 3}));
    }
}
