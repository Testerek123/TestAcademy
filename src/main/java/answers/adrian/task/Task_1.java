package answers.adrian.task;

public class Task_1 {


   public enum DaysOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

   }

    public static void main(String[] args) {

       for(DaysOfWeek day : DaysOfWeek.values()){
           System.out.println(day);
       }

    }


}
