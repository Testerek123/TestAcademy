package answers.lukasz.Tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 2023-09-14 two dimensional array
            <task6>
    Given a rectangle array of integers  n×m in size.
    Rotate it by 90 degrees clockwise,
    and record the result into the new array of integers m×n in size.

    Input consists of the two numbers n and m, not exceeding 100,
    and then an array n×m in size (elements not exceeding 100).

    Output the resulting array. Separate numbers by a single space in the output.

    Sample Input:
            3 4
            11 12 13 14
            21 22 23 24
            31 32 33 34

    Sample Output:
            31 21 11
            32 22 12
            33 23 13
            34 24 14
</task6>*/
public class Task6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();

            System.out.print("Enter the number of columns: ");
            int columns = scanner.nextInt();
            if (rows > 100 || columns > 100) {
                System.out.println("\nNumber of columns exceeds 100. Please try again!");
                return;
            } else if (rows < 1 || columns < 1) {
                System.out.println("\nNumber of columns is less than 1. Please try again!");
                return;
            }
            int[][] array = new int[rows][columns];

            // Input data into the array
            System.out.println("\nEnter the elements of the array:");
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
            System.out.println("\nArray after rotating 90 degrees clockwise:\n");
            displayArray(rotatedArray90);
        }catch (InputMismatchException e){
            System.out.println("Invalid input. Please enter a valid integer.");
            System.exit(1);
        }
    }


    //-------------------------------------------------------------------------------
    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

