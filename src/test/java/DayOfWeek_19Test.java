import org.testng.Assert;
import org.testng.annotations.Test;

public class DayOfWeek_19Test {

    @Test
    public void testHappyDayOfTheWeek() {

        String expectedResult = "Tuesday";
        String actualResult = DayOfWeek_19.getDayOfWeekChooser(2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testInvalid() {

        String expectedResult = "Invalid day of week number ";
        String actualResult = DayOfWeek_19.getDayOfWeekChooser(8);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
