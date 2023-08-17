package answers.grzegorz;

import java.util.Scanner;

enum DayOfWk {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

public class Task2_Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("type the name of the day you want to start listing week days from ");
        System.out.println("use uppercase:  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY ");

        String day = scanner.nextLine();

        // solution 1
        /*
        switch (day) {
            case "SUNDAY":
                enum DayOfWkStartsSUNDAY {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
                for (DayOfWkStartsSUNDAY d : DayOfWkStartsSUNDAY.values()) {
                    System.out.println(d);
                }
                break;
            case "MONDAY":
                enum DayOfWkStartsMONDAY {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
                for (DayOfWkStartsMONDAY d : DayOfWkStartsMONDAY.values()) {
                    System.out.println(d);
                }
                break;
            case "TUESDAY":
                enum DayOfWkStartsTUESDAY {TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, MONDAY}
                for (DayOfWkStartsTUESDAY d : DayOfWkStartsTUESDAY.values()) {
                    System.out.println(d);
                }
                break;
            case "WEDNESDAY":
                enum DayOfWkStartsWEDNESDAY {WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, MONDAY, TUESDAY}
                for (DayOfWkStartsWEDNESDAY d : DayOfWkStartsWEDNESDAY.values()) {
                    System.out.println(d);
                }
                break;
            case "THURSDAY":
                enum DayOfWkStartsTHURSDAY {THURSDAY, FRIDAY, SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY}
                for (DayOfWkStartsTHURSDAY d : DayOfWkStartsTHURSDAY.values()) {
                    System.out.println(d);
                }
                break;
            case "FRIDAY":
                enum DayOfWkStartsFRIDAY {FRIDAY, SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY}
                for (DayOfWkStartsFRIDAY d : DayOfWkStartsFRIDAY.values()) {
                    System.out.println(d);
                }
                break;
            case "SATURDAY":
                enum DayOfWkStartsSATURDAY {SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY}
                for (DayOfWkStartsSATURDAY d : DayOfWkStartsSATURDAY.values()) {
                    System.out.println(d);
                }
                break;
                default:
                System.out.println("not a valid day name - check spelling / case ");
        }
        */
        int dayIndex = 0;
        switch (day) {
            case "SUNDAY":
                dayIndex = 0;
                break;
            case "MONDAY":
                dayIndex = 1;
                break;
            case "TUESDAY":
                dayIndex = 2;
                break;
            case "WEDNESDAY":
                dayIndex = 3;
                break;
            case "THURSDAY":
                dayIndex = 4;
                break;
            case "FRIDAY":
                dayIndex = 5;
                break;
            case "SATURDAY":
                dayIndex = 6;
                break;
            default:
                dayIndex = 7;
                System.out.println("not a valid day name - check spelling / case ");
        }



        // In Java, you cannot directly obtain the number of elements in an enum class,
        // as enums are not designed to have a dynamic size.
        // However, you can achieve this by manually adding a counter in your enum or by using the values() method
        // provided by the enum class to get an array of all enum constants
        // and then getting the length of that array.

        DayOfWk[] daysOfWeek = DayOfWk.values();
        int numberOfDays = daysOfWeek.length;


        for (int i = 0; i < numberOfDays; i++) {
            if (i >= dayIndex && dayIndex < 7) {
                System.out.println(daysOfWeek[i]);
            }
        }
        for (int i = 0; i < numberOfDays; i++) {
            if (i < dayIndex && dayIndex < 7) {
                System.out.println(daysOfWeek[i]);
            }
        }
    }
}
