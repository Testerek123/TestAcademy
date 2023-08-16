package answers.lukasz;

public class Task1_Days {

    public enum DayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

    public static void main(String[] args) {
        for (DayOfWeek days : DayOfWeek.values()){
            System.out.println(days);
        }
    }


}