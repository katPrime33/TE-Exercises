package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CigarPartyTest {

    private CigarParty cigarParty;

    @Before
    public void setup(){
        cigarParty = new CigarParty();
    }

    @Test
    public void haveParty_returns_true_if_cigar_minimum_is_40_inclusive(){
        //Arrange
        int cigars = 40;
        CigarParty party = new CigarParty();
        //Act
        boolean cigarCount = cigarParty.haveParty(cigars, false);
        //Assert
        Assert.assertTrue("40 should be inclusive", cigarCount);
    }

    @Test
    public void haveParty_returns_false_when_cigars_less_than_40_and_is_weekend(){
        //Arrange
        int cigars = 24;
        //Act
        boolean cigarCount = cigarParty.haveParty(cigars, true);
        //Assert
        Assert.assertFalse("No party! Not enough cigars! :( ", cigarCount);
    }

    @Test
    public void haveParty_returns_true_if_when_cigars_between_40_and_60_and_is_weekend(){
        //Arrange
        int cigars = 50;
        //Act
        boolean cigarCount = cigarParty.haveParty(cigars, true);
        //Assert
        Assert.assertTrue("Cigar Party is on!", cigarCount);
    }

    @Test
    public void haveParty_returns_true_when_is_weekend_and_cigars_equal_more_than_60(){
        //Arrange
        int cigars = 88;
        //Act
        boolean cigarCount = cigarParty.haveParty(cigars, true);
        //Assert
        Assert.assertTrue("Party is on!", cigarCount);
    }

    @Test
    public void haveParty_returns_false_if_is_not_weekend_and_cigars_equal_more_than_60(){
        //Arrange
        int cigars = 70;
        //Act
        boolean cigarCount = cigarParty.haveParty(cigars, false);
        //Assert
        Assert.assertFalse("No party! Too many cigars!", cigarCount);
    }

    @Test
    public void haveParty_returns_false_when_negative_int_passed_in_on_weekday(){
        //Arrange
        int cigars = -10;
        //Act
        boolean cigarCount = cigarParty.haveParty(cigars, false);
        //Assert
        Assert.assertFalse("No party.", cigarCount);
    }

    @Test
    public void haveParty_returns_false_when_negative_int_passed_in_on_weekend(){
        //Arrange
        int cigars = -1;
        //Act
        boolean cigarCount = cigarParty.haveParty(cigars, true);
        //Assert
        Assert.assertFalse("no party.", cigarCount);
    }

}
