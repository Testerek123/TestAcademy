package answers.laxmi.demo;
//The valueOf() method takes a string and returns an enum constant having the same string name. //
public class valueof {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    }


        public static void main(String[] args) {
            String userInput = "MONDAY";

            try {
                Day selectedDay = Day.valueOf(userInput);
                System.out.println("You selected: " + selectedDay);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter a valid day.");
            }
        }
    }



