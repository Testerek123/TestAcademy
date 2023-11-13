package answers.lukasz.Tasks;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ship ship = new Ship();
        System.out.println("""

                \nChose your action:
                                
                1. Load container on the ship (select container color in next step 1.1)
                2. List containers with their ID's  already loaded on the ship
                3. Display number of containers loaded
                4. Exit program\n""");

        String input = scanner.nextLine();
        while (!(input.equals("4"))) {
            switch (input) {
                case "1":
                    System.out.println("\nWhat color container do you want to load? ( red, white, blue ):");
                    String color = scanner.nextLine();
                    while (!color.equals("stop")) {
                        ship.loadContainer(color);
                        System.out.println("\nEnter another color or type 'stop' to finish:");
                        color = scanner.nextLine();
                    }
                    break;
                case "2":
                    ship.listContainer();
                    break;
                case "3":
                    ship.getLoadedContainerCount();
                    break;
                default:
                    System.out.println("\nInvalid option:");
            }
            System.out.println("\nChose your action:\n1. Load container on the ship\n2. List containers\n3. Display number of containers\n4. Exit program");
            input = scanner.nextLine();
        }
        System.out.println("The program has ended");
    }
}