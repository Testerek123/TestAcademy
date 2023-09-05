package answers.lukasz.Tasks;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string representing a number (1-9):");

        while (true) {
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("stop this!")) {
                System.out.println("I thought you'll never ask.");
                break;

            } else {

                switch (input) {
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
                        System.out.println("Invalid number!\nPlease try again! or enter 'stop this!' to end the program.");
                }
            }
        }
        scanner.close();
    }
}