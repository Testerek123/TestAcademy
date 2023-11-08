package answers.adrian.task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 0 to 1000000:");

        while (true) {

            try {
                int number = scanner.nextInt();

                if (number >= 0 && number <= 1000000) {
                    int resultTens = (number / 10) % 10;
                    System.out.println("Tens number is : " + resultTens);

                } else if (number == 1000001) {
                    System.out.println("Program is close");

                    break;
                } else {
                    System.out.println("Incorrect number ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number 0 to 1000000");
                scanner.next();

            }

        }
        scanner.close();
    }
}
