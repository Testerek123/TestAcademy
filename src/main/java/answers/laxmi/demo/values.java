package answers.laxmi.demo;
//, the values() method is a built-in method provided by the Enum class.
// It returns an array containing all the enum constants in the order they are declared.
public class values {

    public enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

        public static void main(String[] args) {
            Day[] days = Day.values();//This line creates an array named days of type Day and assigns it the values returned by the Day.values() method. Assuming Day is an enum with constants like SUNDAY, MONDAY, etc., this line will populate the days array with all the enum constants.

    // This is a for-each loop that iterates over each element in the days array. In each iteration, it assigns the current element to the variable day, which is of type Day. Then, it prints out the value of day using System.out.println(day).

            for (Day day : days) {
                System.out.println(day);
            }
        }
    }


