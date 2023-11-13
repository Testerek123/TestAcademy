package answers.lukasz.Tasks.Task3;

import java.util.Scanner;
/*we display assigned enum label of string input*/
public enum Task3_2 {
    ONE("1"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9");

    public final String label;

    Task3_2(String label) {
        this.label = label;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string representing a number (1-9):");
        String input = scanner.nextLine().toUpperCase();
        scanner.close();

        try {
            Task3_2 startDay = Task3_2.valueOf(input);
            System.out.println("output = " + startDay.label);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid number! Please try again!");
        }
    }
}
