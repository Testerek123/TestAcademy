package answers.adrian.task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {

        try (Scanner snail = new Scanner(System.in)) {

            System.out.println("Enter height: ");
            int height = snail.nextInt();

            System.out.println("Enter up: ");
            int up = snail.nextInt();

            System.out.println("Enter down: ");
            int down = snail.nextInt();

            int result = snailTrip(height, up, down);
            System.out.println("Snail needs " + result + " day");

        } catch (InputMismatchException e) {
            System.out.println("Please enter valid number!");

        }
    }


    public static int snailTrip(int h, int u, int d) {

        if (u <= 0 || d <= 0) {
            System.out.println("Enter the number greater than 0 ");
            return -1;
        }


        if (u < d || u == d) {
            System.out.println("Up must be greater the down ");
            return -1;
        }


        int actualH = 0;
        int day = 0;


        while (actualH <= h) {

            day++;

            actualH += u;

            if (actualH >= h) {
                break;
            }
            actualH -= d;

        }
        return day;

    }

}

