package answers.szymon.task6;

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
        int[][] rotatedArray = new int[m][n];

        System.out.println("Enter array rows:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotatedArray[i][j] = array[n - 1 - j][i];
            }
        }

        System.out.println("Rotated array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotatedArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}






// GOOD TO FIX:
// - input jako tablica o innych rozmiarach niż zadeklarowane n x m
// - uruchomienie programu ponownie po wyświetleniu error mess.
