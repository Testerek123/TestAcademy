package answers.lukasz.Tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();

            System.out.print("Enter the number of columns: ");
            int columns = scanner.nextInt();
            if (rows > 100 || columns > 100) {
                System.out.println("Number of columns exceeds 100. Please try again!");
                return;
            } else if (rows < 1 || columns < 1) {
                System.out.println("Number of columns is less than 1. Please try again!");
                return;
            }
            int[][] array = new int[rows][columns];
            // Input data into the array
            System.out.println("Enter the elements of the array:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    int input = scanner.nextInt();
                    if (input > 100) {
                        System.out.println("\"Value is greater than 100. Please try again!");
                        return;
                    }
                    array[i][j] = input;
                }
            }
//-------------------------------------------------------------------------------
            // Rotate the array 90 degrees clockwise
            int[][] rotatedArray90 = new int[columns][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    rotatedArray90[j][rows - 1 - i] = array[i][j];
                }
            }
            System.out.println("\nArray after rotating = 90 degrees:\n");
            displayArray(rotatedArray90);

            //-------------------------------------------------------------------------------

            // Rotate the array 90 degrees clockwise
            int[][] rotatedArray180 = new int[rows][columns];
            for (int i = 0; i < columns; i++) {
                for (int j = 0; j < rows; j++) {
                    rotatedArray180[j][columns - 1 - i] = rotatedArray90[i][j];
                }
            }
            System.out.println("\nArray after rotating = 180 degrees:\n");
            displayArray(rotatedArray180);

//-------------------------------------------------------------------------------

            // Rotate the array 90 degrees clockwise
            int[][] rotatedArray270 = new int[columns][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    rotatedArray270[j][rows - 1 - i] = rotatedArray180[i][j];
                }
            }
            System.out.println("\nArray after rotating 270 degrees:\n");
            displayArray(rotatedArray270);
//-------------------------------------------------------------------------------

        } catch (
                InputMismatchException e) {
            System.out.println("\nInvalid input. Please enter a valid integer.");
            System.exit(1);
        }

    }

    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
