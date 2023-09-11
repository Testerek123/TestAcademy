package answers.laxmi;

public class Compareto {

    // Define an enum called Day
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

        public static void main(String[] args) {
            // Get two enum constants
            Day day1 = Day.MONDAY;
            Day day2 = Day.WEDNESDAY;

            // Compare the ordinal values
            int result = day1.compareTo(day2);

            // Print the result
            if (result < 0) {
                System.out.println(day1 + " comes before " + day2);
            } else if (result > 0) {
                System.out.println(day1 + " comes after " + day2);
            } else {
                System.out.println(day1 + " is the same as " + day2);
            }
        }
    }



