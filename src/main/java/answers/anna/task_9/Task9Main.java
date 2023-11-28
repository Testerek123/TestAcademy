package answers.anna.task_9;
import java.util.Scanner;

public class Task9Main {

    public static void main(String[] args){
        //snailTrip(10, 3, 2);
        getDataFromUser();

    }

    public static void getDataFromUser(){
        Scanner sc = new Scanner(System.in);
        int pole = 0;
        int day = 0;
        int night = 0;
        System.out.println("Provide values for snails journey(all values has to be greater then 0):\s");
        System.out.println("Lenght of the pole:\s");
        pole = sc.nextInt();
        System.out.println("Daily progress:\s");
        day = sc.nextInt();
        System.out.println("Nightly regress:\s");
        night = sc.nextInt();
        if (pole >= 0 && day > night && day >=0 && night >=0){
            snailTrip(pole, day, night);
        } else {
            System.out.println("incorrect data, try again");
            getDataFromUser();
        }
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
