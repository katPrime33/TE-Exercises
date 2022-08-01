import com.techelevator.DateFashion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class DateFashionTest {

    private DateFashion dateFashion;

    @Before
    public void setup(){
        dateFashion = new DateFashion();
    }

    @Test
    public void getATable_yes_when_you_yes_and_date_yes(){
        //Arrange
        DateFashion dateFashion = new DateFashion();
        int you = 8;
        int date = 9;
        //Act
        int input = dateFashion.getATable(you, date);
        //Assert
        Assert.assertEquals(2, input);
    }

    @Test
    public void getATAble_yes_when_you_maybe_and_date_yes(){
        //Arrange
        DateFashion dateFashion = new DateFashion();
        int you = 5;
        int date = 10;
        //Act
        int input = dateFashion.getATable(you, date);
        //Assert
        Assert.assertEquals(2, input);
    }

    @Test
    public void getATable_yes_when_date_maybe_and_you_yes(){
        //Arrange
        DateFashion dateFashion= new DateFashion();
        int you = 9;
        int date = 4;
        //Act
        int input = dateFashion.getATable(you, date);
        //Assert
        Assert.assertEquals(2, input);
    }

    @Test
    public void getATable_maybe_when_both_are_maybe(){
        //Arrange
        DateFashion dateFashion = new DateFashion();
        int you = 6;
        int date = 4;
        //Act
        int input = dateFashion.getATable(you, date);
        //Assert
        Assert.assertEquals(1, input);
    }

    @Test
    public void getATable_no_when_you_maybe_and_date_no(){
        //Arrange
        DateFashion dateFashion = new DateFashion();
        int you = 7;
        int date = 2;
        //Act
        int input = dateFashion.getATable(you, date);
        //Assert
        Assert.assertEquals(0, input);
    }

    @Test
    public void getATable_no_when_you_no_and_date_yes(){
        //Arrange
        DateFashion dateFashion = new DateFashion();
        int you = 2;
        int date = 8;
        //Act
        int input = dateFashion.getATable(you, date);
        //Assert
        Assert.assertEquals(0, input);
    }

    @Test
    public void getATable_no_when_date_no_but_you_yes(){
        //Arrange
        DateFashion dateFashion = new DateFashion();
        int you = 10;
        int date = 2;
        //Act
        int input = dateFashion.getATable(you, date);
        //Assert
        Assert.assertEquals(0, input);
    }

}
