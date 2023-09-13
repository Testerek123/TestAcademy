package answers.anna.task_4;

import java.util.Scanner;

public class Task4Main {

    public static void main(String[] args){
            getNumberFromUser();
    }
    public static void getNumberFromUser() {
        Scanner sc = new Scanner(System.in);
        String input = "start";
        while (input != "stop this!"){
            System.out.println("Write number from 0 to 9 as a string: ");
            input = sc.nextLine();
            input = input.toLowerCase();
            sc.close();
            switch (input) {
                case "zero":
                    System.out.println("Your number is: " + 0);
                    break;
                case "one":
                    System.out.println("Your number is: " + 1);
                    break;
                case "two":
                    System.out.println("Your number is: " + 2);
                    break;
                case "three":
                    System.out.println("Your number is: " + 3);
                    break;
                case "four":
                    System.out.printf("Your number is: " + 4);
                    break;
                case "five":
                    System.out.println("Your number is: " + 5);
                    break;
                case "six":
                    System.out.println("Your number is: " + 6);
                    break;
                case "seven":
                    System.out.println("Your number is: " + 7);
                    break;
                case "eight":
                    System.out.println("Your number is: " + 8);
                    break;
                case "nine":
                    System.out.println("Your number is: " + 9);
                    break;
                case "stop this!":
                    System.out.println("I thought you'll never ask.");
                    System.exit(0);
                default:
                    System.out.println("Sorry, I don't understand, try again");

            }
        }
    }

}


