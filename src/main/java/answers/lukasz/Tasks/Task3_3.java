package answers.lukasz.Tasks;

import java.util.Scanner;

public class Task3_3 {


    enum numbersEnum {one, two, three, four, five, six, seven, eight, nine}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int input = scanner.nextInt();
        scanner.close();
        System.out.println("input: " + input);
// solution 1
        numbersEnum[] numberName = numbersEnum.values();

        System.out.println("numb[number]: " + numberName[input]);
        numbersEnum chosenNumber = numberName[input - 1];

        System.out.println("numb[number-1]: " + numberName[input - 1]);
        System.out.println("chosenNumber: " + chosenNumber);
        if (input >= 1 && input <= 9) {

/*            switch (chosenNumber) {
                case one:
                    System.out.println("one");
                    break;
                case two:
                    System.out.println("two");
                    break;
                case three:
                    System.out.println("three");
                    break;
                case four:
                    System.out.println("four");
                    break;
                case five:
                    System.out.println("five");
                    break;
                case six:
                    System.out.println("six");
                    break;
                case seven:
                    System.out.println("seven");
                    break;
                case eight:
                    System.out.println("eight");
                    break;
                case nine:
                    System.out.println("nine");
                    break;
            }
        } else {
            System.out.println("Invalid number!\nPlease try again!:");
        }
    }
}*/
// solution 2

            switch (input) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("Invalid number!\nPlease try again!");
            }
        }
    }
}