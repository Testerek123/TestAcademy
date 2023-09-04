package answers.anna.task_4;

import java.util.Scanner;

public class Task4Main {

    public static void main(String[] args){
            getNumberFromUser();
    }

    public static void getNumberFromUser() {
        Scanner sc = new Scanner(System.in);
        //
        String input = "start";
        int output = 0;
        while (input != "stop this!"){
            System.out.println("Write number from 0 to 9 as a string: ");
            input = sc.nextLine();
            input = input.toLowerCase();
            switch (input) {
                case "zero":
                    output = 0;
                    System.out.println("Your number is: " + output);
                    break;
                case "one":
                    output = 1;
                    System.out.println("Your number is: " + output);
                    break;
                case "two":
                    output = 2;
                    System.out.println("Your number is: " + output);
                    break;
                case "three":
                    output = 3;
                    System.out.println("Your number is: " + output);
                    break;
                case "four":
                    output = 4;
                    System.out.printf("Your number is: " + output);
                    break;
                case "five":
                    output = 5;
                    System.out.println("Your number is: " + output);
                    break;
                case "six":
                    output = 6;
                    System.out.println("Your number is: " + output);
                    break;
                case "seven":
                    output = 7;
                    System.out.println("Your number is: " + output);
                    break;
                case "eight":
                    output = 8;
                    System.out.println("Your number is: " + output);
                    break;
                case "nine":
                    output = 9;
                    System.out.println("Your number is: " + output);
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


