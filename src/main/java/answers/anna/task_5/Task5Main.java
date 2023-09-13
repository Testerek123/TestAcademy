package answers.anna.task_5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task5Main {

    public static void main(String[] args) {
        getTensDigits();
    }

    public static void getTensDigits() {
        int high = 1000000;
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Write integer number in range from 0 to 1000000, or 1000001 to exit");
            while (!sc.hasNextInt()) {
                System.out.println("That's not an integer, try again");
                getTensDigits();
                sc.nextInt();
            }
            number = sc.nextInt();
        }
        while (sc.hasNextInt());
        {
            if (0 <= number && number <= high) {
                //System.out.println("Tens digit is: " + getTensNumber(number));
                System.out.println("Tens digit is: " + tensNumberFromStringList(number));
                getTensDigits();
                sc.close();
            } else if (number == 1000001) {
                sc.close();
                System.exit(0);
            } else {
                sc.close();
                System.out.println("Sorry, your number isn't in correct range, try again with correct number");
                getTensDigits();
            }
        }
    }


    //// method where we divide users number by 10, and then we get modulo 10 (rest from division by 10)
    /// integer represents only full value  so 1234/10 = 123,4 => but int 123 and 123%10 = 12 rest 3
    public static int getTensNumber(int usersNumber) {
        return usersNumber / 10 % 10;
    }

    //// method where we turn integer into string,then string into list of single characters, and we get
    /// one before last element from list = String representing digit of tens, we subtract 2 (not 1) as indexing is from 0,
    /// so for integer 4321 we have [0]=4, [1]=3, [2]=2, [3]=1, size of list = 4, so to get second from last index we do 4-2
    public static String tensNumberFromStringList(int userNumber) {
        String stringNumber = String.valueOf(userNumber);
        List<String> elementsList = Arrays.asList(stringNumber.split(""));
        return elementsList.get(elementsList.size() - 2);
    }
}
