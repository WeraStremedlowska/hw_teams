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
    public void testTheInvalidDayOfTheWeek() {

        String expectedResult = "Invalid day of week number ";
        String actualResult = DayOfWeek_19.getDayOfWeekChooser(8);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTheInvalidDayOfTheWeekWithNegativeNumber() {

        String expectedResult = "Invalid day of week number ";
        String actualResult = DayOfWeek_19.getDayOfWeekChooser(-1);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTheLastDayOfTheWeek(){
        String expectedResult = "Sunday";
        String actualResult = DayOfWeek_19.getDayOfWeekChooser(7);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTheFirstDayOfTheWeek(){
        String expectedResult = "Monday";
        String actualResult = DayOfWeek_19.getDayOfWeekChooser(1);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
