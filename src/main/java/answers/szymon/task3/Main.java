package answers.szymon.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 9 (in words):");
        String userAnswer = scanner.nextLine();

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
            default -> System.out.println("Invalid digit name was entered");
        }
        scanner.close();
    }
}