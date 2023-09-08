package answers.laxmi.demo;

public class Ordinal {
//The ordinal() method returns the position of an enum constant.//
    // Define an enum called Days
    enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }



        public static void main(String[] args) {
            // Accessing the ordinal value of enum constants
            System.out.println("Ordinal of SUNDAY: " + Days.SUNDAY.ordinal());
            System.out.println("Ordinal of MONDAY: " + Days.MONDAY.ordinal());
            System.out.println("Ordinal of TUESDAY: " + Days.TUESDAY.ordinal());
            System.out.println("Ordinal of WEDNESDAY: " + Days.WEDNESDAY.ordinal());
            System.out.println("Ordinal of THURSDAY: " + Days.THURSDAY.ordinal());
            System.out.println("Ordinal of FRIDAY: " + Days.FRIDAY.ordinal());
            System.out.println("Ordinal of SATURDAY: " + Days.SATURDAY.ordinal());
        }
    }


