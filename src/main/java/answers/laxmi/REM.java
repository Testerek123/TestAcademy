package answers.laxmi;


    import java.util.Scanner;

    public class REM {
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a day of the week: ");
            String userInput = scanner.nextLine().toUpperCase();

            try {
                Day userDay = Day.valueOf(userInput);

                System.out.println("Remaining days of the week:");
                Day[] days = Day.values();
              int startIndex = userDay.ordinal() + 1;
                for (int i = startIndex; i < days.length; i++) {
                 System.out.println(days[i]);
                }
               int indentifier = userDay.ordinal();


                for (int i = 0; i < days.length; i++) {
                     if(i-startIndex<0)
                       {
                           if (i != indentifier){
                               System.out.println(days[i]);
                          }
                      }






               }
            }catch(IllegalArgumentException e){
                  //  System.out.println("Invalid name of the week.");
                }

            }
        }




