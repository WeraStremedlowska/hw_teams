public class PrintDayOfTheWeekWithTheNumber { //Виктория К

    //Написать метод, который принимает на вход название дня недели и возвращает порядковый номер от 1 до 7,
    // соответствующий данному дню недели

    public static int getDayOfTheWeek(String dayName) {
        int dayNumber;
        switch (dayName) {
            case "Monday":
                dayNumber = 1;
                break;
            case "Tuesday":
                dayNumber = 2;
                break;
            case "Wednesday":
                dayNumber = 3;
                break;
            case "Thursday":
                dayNumber = 4;
                break;
            case "Friday":
                dayNumber = 5;
                break;
            case "Saturday":
                dayNumber = 6;
                break;
            case "Sunday":
                dayNumber = 7;
                break;

            default:
                dayNumber = -1;
        }
        return dayNumber;
    }
}


