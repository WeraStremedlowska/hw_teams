public class PrintDayOfTheWeekWithTheNumber { //Виктория К

    //Написать метод, который принимает на вход название дня недели и возвращает порядковый номер от 1 до 7,
    // соответствующий данному дню недели
    public static int getDayOfTheWeek(String dayName) {

        String[] dayOfTheWeek = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        for (int i = 0; i < dayOfTheWeek.length; i++) {
            if (dayOfTheWeek[i].equals(dayName)) {
                return ++i; // Викуля я добавила +
            }
        }
        return -1;
    }

    public static int printDayNumber(int dayNumber) {
        if (dayNumber != -1) {
            return dayNumber;
        } else {
            return -1;
        }
    }
}
