import com.techelevator.AnimalGroupName;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalGroupNameTest {

    private AnimalGroupName animalGroupName;

    @Before
    public void setup(){
        animalGroupName = new AnimalGroupName();
    }

    @Test
    public void provide_known_animal_name_expect_group_name_returned(){
        //Arrange in @Before
        //Act
        String groupNameResult = animalGroupName.getHerd("giraffe");
        //Assert
        Assert.assertEquals("Tower", groupNameResult);
    }

    @Test
    public void provide_different_case_of_known_animal_and_expect_group_name_returned() {
        //Arrange in @Before
        //Act
        String groupNameResult = animalGroupName.getHerd("Giraffe");
        //Assert
        Assert.assertEquals("Tower", groupNameResult);
    }

    @Test
    public void provide_unknown_animal_name_expect_unknown_returned(){
        //Arrange in @Before
        //Act
        String groupNameResult = animalGroupName.getHerd("Cat");
        //Assert
        Assert.assertEquals("unknown", groupNameResult);
    }

    @Test
    public void provide_null_animal_name_expect_unknown_returned(){
        //Arrange in @Before
        //Act
        String groupNameResult = animalGroupName.getHerd(null);
        //Assert
        Assert.assertEquals("unknown", groupNameResult);
    }

    @Test
    public void provide_empty_string_for_animal_name_expect_unknown_returned(){
        //Arrange in @Before
        //Act
        String groupNameResult = animalGroupName.getHerd("");
        //Assert
        Assert.assertEquals("unknown", groupNameResult);
    }

}
