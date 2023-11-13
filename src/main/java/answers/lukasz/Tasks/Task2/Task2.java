package answers.lukasz.Tasks.Task2;

import java.util.Scanner;

enum DaysOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //created scanner object
        System.out.print("Enter name of the week in uppercase: ");
        String userEntry = scanner.nextLine().toUpperCase();     //reading line from command prompt assigned to userEntry String
        scanner.close();

        try {
            DaysOfWeek[] daysArray = DaysOfWeek.values();   //creating array called 'daysArray', and assigning values from enum 'DaysOfWeek'
            DaysOfWeek startDay = DaysOfWeek.valueOf(userEntry);    // creating another enum called 'startDay', and assigning day, what user entered to scanner.

            int startIndex = startDay.ordinal();    //Assigning index from 'startDay' to int variable called 'startIndex' e.g: "WEDNESDAY" = 3.

            System.out.println("Days of the week:");
            for (int i = 0; i < daysArray.length; i++) {
                if ((i - startIndex) >= 0) {    //in the first loop, we search for days greater than or equal to the 0 (first index).
                    System.out.println("1) " + daysArray[i]);
                    System.out.println("1) i: " + i + " - startIndex: " + startIndex + " = " + (i - startIndex));
                }
            }
            for (int i = 0; i < daysArray.length; i++) {
                if ((i - startIndex) < 0) {     //in the second loop, we search for days less than the 0 (first index).
                    System.out.println("2) " + daysArray[i]);
                    System.out.println("2) i: " + i + " - startIndex: " + startIndex + " = " + (i - startIndex));
                }
            }
        } catch (IllegalArgumentException e) {      //Displaying message if user enter wrong day
            System.out.println("Invalid name of the week.");
        }
    }
}