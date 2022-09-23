package Day_30_ArrayList;

import java.util.ArrayList;

public class ArrayList_5 {

    // copy, contains(), containsAll(),

    public static void main(String[] args) {

        ArrayList<String> weekDays = new ArrayList<>();

        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");

        ArrayList<String> allDays = new ArrayList<>(weekDays);
                                         // buraya dikkat  üste
        System.out.println("allDays.get(0) = " + allDays.get(0));


        allDays.add("Saturday");
        allDays.add("Subday");

        System.out.println("allDays = " + allDays);

        System.out.println("allDays.contains(\"Tuesday\") = " + allDays.contains("Tuesday"));
                // burda allDays ' tuesday' içeriyor mu diye baktık.
        System.out.println("allDays.indexOf(\"Tuesday\") = " + allDays.indexOf("Tuesday"));
            // burda indek num. baktık
        System.out.println("allDays.get(2==\"Tuesday\") = " + allDays.get(1) =="Tuesday");
        //  burda tuesday 1. index mi diye baktık
        System.out.println("allDays.get(1).equals(\"Tuesday\") = " + allDays.get(1).equals("Tuesday"));
        //  burda da tuesday 1. index mi diye baktık
        System.out.println("allDays.containsAll(weekDays) = " + allDays.containsAll(weekDays));
          //   allDays    weekdays'i içeriyor mu


    }
}
