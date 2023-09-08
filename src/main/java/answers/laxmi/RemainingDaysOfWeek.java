package answers.laxmi;
import java.util.Scanner;


    enum DaysOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public class RemainingDaysOfWeek {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter name of the day in uppercase: ");
            String userEntry = scanner.nextLine();
            scanner.close();

            try {
                DaysOfWeek startDay = DaysOfWeek.valueOf(userEntry);

                System.out.println("Remaining days of the week:");
                for (int i = startDay.ordinal() + 1; i < DaysOfWeek.values().length; i++) {
                    System.out.println(DaysOfWeek.values()[i]);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid day entered.");
            }
        }
    }


