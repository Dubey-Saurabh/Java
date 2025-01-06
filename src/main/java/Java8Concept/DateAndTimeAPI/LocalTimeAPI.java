package Java8Concept.DateAndTimeAPI;

import java.time.LocalTime;

public class LocalTimeAPI {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println(now);

        /*parse time*/
        String time = "13:25:03";
        LocalTime parsedTime = LocalTime.parse(time);


    }
}
