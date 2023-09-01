package answers.laxmi;
import java.util.Scanner;
public class DaysOfWeekProgram {
    enum DaysOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of the week in uppercase: ");
        String userEntry = scanner.nextLine();
        scanner.close();


        try {
            DaysOfWeek startDay = DaysOfWeek.valueOf(userEntry);
            DaysOfWeek[] daysOfWeek = DaysOfWeek.values();

            int startIndex = startDay.ordinal() + 1;

            System.out.println("Days of the week:");
            for (int i = startIndex; i < daysOfWeek.length; i++) {
                System.out.println(daysOfWeek[i]);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid name of the day of the week.");
        }
    }
}
