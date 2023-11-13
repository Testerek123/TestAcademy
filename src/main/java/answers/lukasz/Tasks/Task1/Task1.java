package answers.lukasz.Tasks.Task1;

public class Task1 {

    enum DayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

    //2nd example
    enum MonthsOfTheYear {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}

    public static void main(String[] args) {

        System.out.println("--------TASK1--------");
        for (Task1.DayOfWeek days : Task1.DayOfWeek.values()) {
            System.out.println(days);

        }
        //2nd example
        System.out.println("--------TASK1.1--------");
        for (Task1.MonthsOfTheYear months : Task1.MonthsOfTheYear.values()) {
            System.out.println(months);
        }
    }
}





/*
In Java, an enum (short for "enumeration") is a special data type
that is used to define a set of named constant values.
Enums can be useful for representing a fixed set of related values,
such as days of the week, colors, states, types, models

<task 1>

Declare an enum named DayOfWeek.
It should include all days of the week in uppercase: SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY.

Print days of the week to the console
each day in new line

</task 1>
 */