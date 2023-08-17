package answers.lukasz.Task1;

public class Task1_Main {
    public static void main(String[] args) {
        for (Task1_Days.DayOfWeek days : Task1_Days.DayOfWeek.values()) {
            System.out.println(days);

        }
        //2nd example
        System.out.println("-----------------");
        for (Task1_Days.MonthsOfTheYear months : Task1_Days.MonthsOfTheYear.values()) {
            System.out.println(months);
        }
    }
}
