import org.testng.Assert;
import org.testng.annotations.Test;

public class PrintDayOfTheWeekWithTheNumberTest {

    @Test  // Olga Safronova
    public  void testHappyPassDayOfTheWeekWithNumber(){
//        String[] days =
//                {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};

        int expected = PrintDayOfTheWeekWithTheNumber.getDayOfTheWeek("Понедельник");
        int actual = PrintDayOfTheWeekWithTheNumber.printDayNumber(1);

        Assert.assertEquals(actual, expected);

    }

    @Test  // Olga Safronova
    public  void testDayOfTheWeekWithLastNumber(){

        int expected = PrintDayOfTheWeekWithTheNumber.getDayOfTheWeek("Воскресенье");
        int actual = PrintDayOfTheWeekWithTheNumber.printDayNumber(7);

        Assert.assertEquals(actual, expected);

    }

    @Test  // Olga Safronova
    public  void testDayOfTheWeekEmpty(){

        int expected = PrintDayOfTheWeekWithTheNumber.getDayOfTheWeek("");
        int actual = PrintDayOfTheWeekWithTheNumber.printDayNumber(-1);

        Assert.assertEquals(actual, expected);

    }
}
