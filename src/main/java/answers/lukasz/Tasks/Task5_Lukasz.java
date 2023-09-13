package answers.lukasz.Tasks;

import java.util.Scanner;

public class Task5_Lukasz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number from 0 to 1000000: ");

        while (true) {
            int n = scanner.nextInt();
            int tens = (n / 10) % 10;
            if (n == 1000001) {
                System.out.println("Finishing program. Goodbye.");
                break;
            } else if (0 <= n && n <= 1000000) {
                System.out.print("The tens digit is: " + tens + "\n\n\nEnter your number again: ");
            } else {
                System.out.print("Warning!!!: Your input is invalid. Please try again, or type '1000001' to terminate program: ");
            }
        }
        scanner.close();
    }
}