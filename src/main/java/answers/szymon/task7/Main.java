package answers.szymon.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n and m (not exceeding 100): ");
        int n;
        int m;

        try {
            n = scanner.nextInt();
            m = scanner.nextInt();
            if (n > 100 || m > 100) {
                System.out.println("n and m values cannot exceed 100");
                return;
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
            return;
        }

        int[][] array = new int[n][m];
        int[][] rotatedArray;

        System.out.println("Enter array rows:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter rotation angle (90, 180, or 270): ");
        int rotation = scanner.nextInt();
        if (rotation == 90) {
            rotatedArray = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    rotatedArray[i][j] = array[n - 1 - j][i];
                }
            }
        } else if (rotation == 180) {
            rotatedArray = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    rotatedArray[i][j] = array[n - 1 - i][m - 1 - j];
                }
            }
        } else if (rotation == 270) {
            rotatedArray = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    rotatedArray[i][j] = array[j][m - 1 - i];
                }
            }
        } else {
            System.out.println("Incorrect rotation degrees value");
            return;
        }

        System.out.println("Rotated array:");
        for (int i = 0; i < rotatedArray.length; i++) {
            for (int j = 0; j < rotatedArray[i].length; j++) {
                System.out.print(rotatedArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
