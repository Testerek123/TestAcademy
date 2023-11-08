package answers.adrian.task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of the week in uppercase: ");
        String dayOfWeek = scanner.nextLine().toUpperCase();

        switch (dayOfWeek) {


            case "MONDAY":
                System.out.println("MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY ");
                break;
            case "TUESDAY":
                System.out.println("TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, MONDAY");
                break;
            case "WEDNESDAY":
                System.out.println("WEDNESDAY, THURSDAY, FRIDAY, SATURDAY,SUNDAY, MONDAY, TUESDAY");
                break;
            case "THURSDAY":
                System.out.println("THURSDAY, FRIDAY, SATURDAY,SUNDAY, MONDAY, TUESDAY, WEDNESDAY");
                break;
            case "FRIDAY":
                System.out.println("FRIDAY, SATURDAY,SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY");
                break;
            case "SATURDAY":
                System.out.println("SATURDAY,SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY");
                break;
            case "SUNDAY":
                System.out.println("SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY");
                break;
            default:
                System.out.println("Invalid name of the day");
                break;

        }
        scanner.close();


    }


}
