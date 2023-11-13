package answers.lukasz.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private String id;
    private static int nextId = 1;
    private String color;

    public Container(String color) {
        this.id = String.format("%03d", nextId++);
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }
}

class Ship {
    public List<Container> containers = new ArrayList<>();

/*1. Load container on the ship (select container color in next step 1.1)

        What color container do you want to load? ( red, white, blue ):
        > red
        Container loaded.*/

    public void loadContainer(String color) {
        if (isValidColor(color)) {
            Container container = new Container(color);
            if (containers.size() < 12) {
                containers.add(container);
                System.out.println("Container loaded");
                return;
            }
            System.out.println("\nThe ship is already full. Cannot load more containers.");
            return;
        }
        System.out.println("\nWrong color of container. Please try again!");
    }


/* 2. List containers with their ID's  already loaded on the ship
        3 containers are loaded on the ship:
        1. Container ID = 002, Container color = red*/
    public void listContainer() {
        if (containers.size() == 0) {
            System.out.println("\nContainer is empty for now! Load container on the Ship first!");
            return;
        }
        System.out.println("\n"+containers.size() + " containers are loaded on the ship:");
        for (Container container : containers) {
            System.out.println("\nContainer ID = " + container.getId() + ", Container color = " + container.getColor());
        }
    }

/*3. Display number of containers loaded*/
    public void getLoadedContainerCount() {
        if (containers.size() == 0) {
            System.out.println("\nContainers is empty for now! Load container on the Ship first!");
        } else if (containers.size() == 1) {
            System.out.println("\nLoaded " + containers.size() + " container on the Ship.");
        } else {
            System.out.println("\nLoaded " + containers.size() + " containers on the Ship");
        }
    }

    private static boolean isValidColor(String color) {
        return color.equals("red") || color.equals("white") || color.equals("blue");
    }
}
/*<task8>
Create the program that allows you to load coloured containers on the ship.
For simplicity containers can have three colors: red, white, blue
Each container loaded on the ship should have unique ID
There is unlimited number of containers available to load
Maximum number of containers on the ship is 9.

Sample input:

Chose your action:
1. Load container on the ship (select container color in next step 1.1)
2. List containers with their ID's  already loaded on the ship
3. Display number of containers loaded
4. Exit program

> 2

Sample output:

3 containers are loaded on the ship:

1. Container ID = 002, Container color = red
2. Container ID = 030, Container color = red
3. Container ID = 100, Container color = blue

Chose your action:
1. Load container on the ship (select container color in next step 1.1)
2. List containers with their ID's  already loaded on the ship
3. Display number of containers loaded
4. Exit program

Sample input:

> 1

What color container do you want to load? ( red, white, blue ):
> red

Sample output:

Container loaded.

Chose your action:
1. Load container on the ship (select container color in next step 1.1)
2. List containers with their ID's  already loaded on the ship
3. Display number of containers loaded
4. Exit program

</task8>*/