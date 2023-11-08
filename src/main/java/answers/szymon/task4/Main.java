package answers.szymon.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i > 0; i++) {
            System.out.println("Enter a number from 1 to 9 (in words):");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase("stop this!")) {
                System.out.println("I thought that you'll never ask.");
                break;
            }
            switch (userAnswer.toLowerCase()) {
                case "one" -> System.out.println("1");
                case "two" -> System.out.println("2");
                case "three" -> System.out.println("3");
                case "four" -> System.out.println("4");
                case "five" -> System.out.println("5");
                case "six" -> System.out.println("6");
                case "seven" -> System.out.println("7");
                case "eight" -> System.out.println("8");
                case "nine" -> System.out.println("9");
                default -> System.out.println("Invalid digit name was entered. Try again");
            }
        }
        scanner.close();
    }
}
