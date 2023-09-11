package answers.laxmi;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.print("Enter a number from 1 to 9 (inclusive) or 'stop this!': ");
                    String userInput = scanner.nextLine().toLowerCase();

                    if (userInput.equals("stop this!")) {
                        System.out.println("I thought you'll never ask.");
                        break;  // End the program if the user enters 'stop this!'
                    }

                    try {
                        int number = Integer.parseInt(userInput);

                        if (number >= 1 && number <= 9) {
                            System.out.println("You entered: " + number);
                        } else {
                            System.out.println("Input is out of range (1 to 9). Try again.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number between 1 and 9 or 'stop this!'.");
                    }
                }

                scanner.close();
            }
        }


