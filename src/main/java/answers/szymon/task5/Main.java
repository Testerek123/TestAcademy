package answers.szymon.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i > 0; i++) {
            System.out.println("Enter an integer:");
            int n = scanner.nextInt();
            String number = String.valueOf(n);
            if (n >= 0 && n <= 9) {
                System.out.println("You need an integer of at least two digits. Try again:");

            } else if (n >= 10 && n <= 1000000) {
                char tensDigit = number.charAt(number.length() - 2);
                System.out.println(tensDigit);
            } else if (n == 1000001) {
                break;
            } else {
                System.out.println("Invalid integer entered. Try again:");
            }
        }
        scanner.close();
    }
}