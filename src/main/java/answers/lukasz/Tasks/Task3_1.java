package answers.lukasz.Tasks;

import java.util.Scanner;
/*we display the index of the string input*/
public enum Task3_1 {
    ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string representing a number (1-9):");
        String input = scanner.nextLine().toUpperCase();
        scanner.close();

        try {
            Task3_1 enumValue = Task3_1.valueOf(input);
            int intValue = enumValue.ordinal();
            System.out.println("output = " + (intValue + 1));

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid number! Please try again!");
        }
    }
}