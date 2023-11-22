package answers.anna.task_8;
import java.util.Scanner;

public class Task8Main extends Containers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        getActionFromUser();
    }
    public static void getActionFromUser(){
        Scanner sc = new Scanner(System.in);
        int action = 0;
        System.out.print("""
                    Chose your action:\s
                    1. Load container on the ship (select container color in next step 1.1)\s
                    2. List containers with their ID's  already loaded on the ship\s
                    3. Display number of containers loaded\s
                    4. Exit program\n""");
        while(action != 4){
            action = sc.nextInt();
            switch (action) {
                case 1 -> loading();
                case 2 -> listPresentation();
                case 3 -> System.out.println("Number of containers on ship: " + counter);
                case 4 -> System.exit(13);
                default -> {
                    System.out.println("Incorrect input, try again");
                    getActionFromUser();
                }
            }
            getActionFromUser();
        }
    }

    public static void loading(){
        System.out.println("What color container do you want to load? ( red, white, blue ):");
        String color = sc.nextLine();
        color = color.toLowerCase();
        int id = createContainerId();
        //sc.close();
        switch(color){
            case "red", "white", "blue":
                addContainerToList(color, id);
                break;
            default:
                System.out.println("Incorrect color, try again");
                loading();
        }
    }
}
