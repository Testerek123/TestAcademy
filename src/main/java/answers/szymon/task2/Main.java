package answers.szymon.task2;

import answers.szymon.enums.DayOfWeek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of the week in uppercase:");
        String userAnswer = scanner.nextLine();
        DayOfWeek selectedDay = null;

        for (DayOfWeek day : DayOfWeek.values()) {
            if (userAnswer.equals(day.toString())) {
                selectedDay = day;
                break;
            }
            else System.out.println("INCORRECT DAY OF THE WEEK NAME");
            break;
        }
        if (selectedDay != null) {
            DayOfWeek[] daysOfWeek = DayOfWeek.values();
            int actualDayIndex = selectedDay.ordinal();
            for (int i = 0; i < 7; i++) {
                System.out.println(daysOfWeek[actualDayIndex]);
                actualDayIndex++;
                if (actualDayIndex == 7) {
                    actualDayIndex = 0;
                }
            }
            scanner.close();
        }
    }
}
