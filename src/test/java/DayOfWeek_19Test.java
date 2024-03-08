import org.testng.Assert;
import org.testng.annotations.Test;

public class DayOfWeek_19Test {

    @Test
    public void testHappyDayOfTheWeek(){

        String expectedResult = DayOfWeek_19.getDayOfWeekChooser(2);
        String actualResult = DayOfWeek_19.getDayOfWeekChooser2(2);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
