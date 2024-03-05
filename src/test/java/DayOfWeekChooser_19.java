public class DayOfWeekChooser_19 {

    public static String getDayOfWeekChooser(int dayNumber) {

        String[] daysOfWeek =
                {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        if(dayNumber < 1 || dayNumber > 7) {

            return "Invalid day of week number ";
        } else {

            return daysOfWeek[dayNumber - 1];
        }
    }

    public static String getDayOfWeekChooser1(int dayNumber) {

        String[] daysOfWeek =
                {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        if(dayNumber >= 1 || dayNumber <= 7) {

            return daysOfWeek[dayNumber - 1];
        } else {

            return "Invalid day of week number ";
        }
    }

    public static String getDayOfWeekChooser2(int dayNumber) {
        String nameDayOfWeek;
        switch (dayNumber){
            case 1:
                nameDayOfWeek = "Monday";
                break;
            case 2:
                nameDayOfWeek = "Tuesday";
                break;
            case 3:
                nameDayOfWeek = "Wednesday";
                break;
            case 4:
                nameDayOfWeek = "Thursday";
                break;
            case 5:
                nameDayOfWeek = "Friday";
                break;
            case 6:
                nameDayOfWeek = "Saturday";
                break;
            case 7:
                nameDayOfWeek = "Sunday";
                break;

            default:
                nameDayOfWeek = "Invalid day of week number ";
        }
        return nameDayOfWeek;
    }
}
