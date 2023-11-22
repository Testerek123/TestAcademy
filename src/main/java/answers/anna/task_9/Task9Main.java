package answers.anna.task_9;

public class Task9Main {

    public static void main(String[] args){
        snailTrip(10, 3, 2);

    }

    public static void snailTrip(int pole, int day, int night ){
        int effort = 0;
        int dayCounter = 0;
        while (effort < pole){
            effort =  effort + day;
            dayCounter++;
            if (effort < pole){
                effort = effort - night;
            }
        }
        System.out.println("Snail wiil get to the top of the pole in day: " + dayCounter);
    }
}
