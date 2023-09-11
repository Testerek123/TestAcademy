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
            DaysOfWeek[] daysOfWeek = DaysOfWeek.values();
            DaysOfWeek startDay = DaysOfWeek.valueOf(userEntry);// Find an object by name
            //DaysOfWeek[] daysOfWeek = DaysOfWeek.values();// create an array of objects from enum

           // for(DaysOfWeek dayOfWeek2 : daysOfWeek){
             //   System.out.println(dayOfWeek2);

           // System.out.println(daysOfWeek[0]);
           // System.out.println(daysOfWeek[1]);


            int startIndex = startDay.ordinal() ; // get index (integer) of an object found in line 16 and add 1

            System.out.println("Days of the week:");
            for (int i = 0; i < daysOfWeek.length; i++) {
                if((i-startIndex)>=0)
                {
                    System.out.println(daysOfWeek[i-startIndex]);
                    System.out.println(i-startIndex);
                }

            }
            for (int i = 0; i < daysOfWeek.length; i++) {
                if((i-startIndex<0))
                {
                    System.out.println(daysOfWeek[i]);
                }


            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid name of the week.");
        }
    }
}