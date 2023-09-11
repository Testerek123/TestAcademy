package answers.lukasz.Tasks;

import java.util.Scanner;

public class Task3 {
        /*
    <task 3>
        Write a program that reads a string from the standard input and outputs the number.
        A number can be from 1 to 9 (inclusive). using "switch" statement is a plus.

        Sample Input: one
        Sample Output: 1
        Sample Input: seven
        Sample Output: 7
    </task 3>*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number name: (e.g: two)");
        String numberName = scanner.nextLine();
        scanner.close();


        switch (numberName) { // switch statement -> compares our input with cases
            case "one":
                System.out.println(1);
                break;
            case "two":
                System.out.println(2);
                break;
            case "three":
                System.out.println(3);
                break;
            case "four":
                System.out.println(4);
                break;
            case "five":
                System.out.println(5);
                break;
            case "six":
                System.out.println(6);
                break;
            case "seven":
                System.out.println(7);
                break;
            case "eight":
                System.out.println(8);
                break;
            case "nine":
                System.out.println(9);
                break;

            default:
                System.out.println("Invalid number!\nPlease try again!");
        }

    }
}