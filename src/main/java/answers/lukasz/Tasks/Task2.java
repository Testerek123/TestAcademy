package answers.lukasz.Tasks;

import java.util.Scanner;

public class Task2 {
    enum DayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DayOfWeek startDay = null;

        while (startDay == null) {
            System.out.print("Enter name of the week in uppercase: ");
            String inputDay = scanner.nextLine().toUpperCase();

            try {
                startDay = DayOfWeek.valueOf(inputDay);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid name of the day of the week");
            }
        }

        DayOfWeek[] days = DayOfWeek.values();
        int startIndex = startDay.ordinal();

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[(startIndex + i) % days.length]);
        }

        scanner.close();
    }
}



/*
Let's expand on task 1:

<task 2>
Prompt user to input any name of the week in uppercase:
- ex. prompt = "enter name of the week in uppercase:"
- ex. entry = "FRIDAY"

now print days of the week to the console starting from the day user provided.
if user enters incorrect name print warning message "invalid name of the day of the week" and end program

- ex. output =
FRIDAY
SATURDAY
SUNDAY
MONDAY
TUESDAY
WEDNESDAY
THURSDAY
 */