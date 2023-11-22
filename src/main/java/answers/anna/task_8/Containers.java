package answers.anna.task_8;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Containers {
    static int counter =0;
    int containerId;
    String containerColor;

    static List<Containers> containerList = new ArrayList<>();

    public int getContainerId() {
        return containerId;
    }

    public void setContainerId(final int containerId) {
        this.containerId = containerId;
    }

    public String getContainerColor() {
        return containerColor;
    }

    public void setContainerColor(final String containerColor) {
        this.containerColor = containerColor;
    }
    public static void addContainerToList(String containerColor, int containerId){
        Containers container = new Containers();
        container.setContainerColor(containerColor);
        container.setContainerId(containerId);
        containerList.add(container);
        counter ++;
        System.out.println("Container loaded to the ship!");
    }

    public static int createContainerId(){
        Random num = new Random();
        int num1 = num.ints(0,9).findAny().getAsInt();
        int num2 = num.ints(0,9).findAny().getAsInt();
        int num3 = num.ints(0,9).findAny().getAsInt();
        return Integer.parseInt(String.valueOf(num1) + String.valueOf(num2) + String.valueOf(num3));
    }

    static void listPresentation(){
        System.out.println("List of containers on the ship:\s");
        for (Containers container : containerList){
            System.out.println("Container ID= " + container.getContainerId() +
                    ", Container Color= " + container.containerColor + "\s");
        }
    }
}
