package answers.lukasz.Tasks;

import java.util.Scanner;

public enum Task4_1 {
    ONE("1"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9");
    public final String label;
    Task4_1(String label) {
        this.label = label;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string representing a number (1-9):");
        while (true) {
            String input = scanner.nextLine().toUpperCase();
            if (input.equals("STOP THIS!")) {
                System.out.println("I thought you'll never ask.");
                break;

            } else {
                try {
                    Task4_1 startDay = Task4_1.valueOf(input);
                    System.out.println("output = " + startDay.label);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid number! Please try again!");
                }
            }
        }
        scanner.close();
    }
}