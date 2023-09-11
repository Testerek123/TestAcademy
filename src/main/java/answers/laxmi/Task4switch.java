package answers.laxmi;
import java.util.Scanner;
public class Task4switch {
    public static void main(String[] args) {


               Scanner scanner = new Scanner(System.in);
                String userInput;

                while (true) {
                    System.out.print("Enter a number from 1 to 9 (inclusive) or 'stop this!': ");
                    userInput = scanner.nextLine().toLowerCase();

                    switch (userInput) {
                        case "stop this!":
                            System.out.println("I thought you'll never ask.");
                            scanner.close(); // Close the scanner before ending the program
                            System.exit(0); // Exit the program
                            break;


                        case "one":

                            System.out.println("You entered: " + 1);
                            break;
                        case "two":

                            System.out.println("You entered: " + 2);
                            break;
                        case "three":

                            System.out.println("You entered: " + 3);
                            break;
                        case "four":

                            System.out.println("You entered: " + 4);
                            break;
                        case "five":

                            System.out.println("You entered: " + 5);
                            break;
                        case "six":

                            System.out.println("You entered: " + 6);
                            break;
                        case "seven":
                            System.out.println("You entered: " + 7);
                            break;
                        case "eight":

                            System.out.println("You entered: " + 8);
                            break;
                        case "nine":

                            System.out.println("You entered: " + 9);
                            break;


                        default:
                            System.out.println("Invalid input. Please enter a number between 1 and 9 or 'stop this!'.");
                    }
                }
            }
        }



