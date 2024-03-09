import org.testng.Assert;
import org.testng.annotations.Test;

public class PrintDayOfTheWeekWithTheNumberTest {

    @Test  // Olga Safronova
    public  void testHappyPassDayOfTheWeekWithNumber(){

        int expected = 1;
        int actual = PrintDayOfTheWeekWithTheNumber.getNumberOfTheWeek("Monday");

        Assert.assertEquals(actual, expected);

    }

    @Test  // Olga Safronova
    public  void testDayOfTheWeekWithLastNumber(){

        int expected = 7;
        int actual = PrintDayOfTheWeekWithTheNumber.getNumberOfTheWeek("Sunday");

        Assert.assertEquals(actual, expected);

    }

    @Test  // Olga Safronova
    public  void testDayOfTheWeekEmpty(){

        int expected = -1;
        int actual = PrintDayOfTheWeekWithTheNumber.getNumberOfTheWeek("");

        Assert.assertEquals(actual, expected);

    }
}
