package answers.lukasz.Tasks;

import java.util.Scanner;

public class Task3_Array {
    public static void main(String[] args) {
        String[] numbersArray = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number name: ");
        String input = scanner.nextLine();

        scanner.close();

        int foundIndex = -1;
        for (int i = 0; i < numbersArray.length; i++) {
            if (input.equals(numbersArray[i])) {
                foundIndex = i + 1;
                System.out.println("input: " + input + " / i: " + i);
                System.out.println("foundIndex: " + foundIndex + " / numbers[i]: " + numbersArray[i]);
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println(foundIndex);

        } else {
            System.out.println("Invalid number word!");
        }
    }
}