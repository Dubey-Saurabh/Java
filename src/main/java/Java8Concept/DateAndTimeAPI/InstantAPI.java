package Java8Concept.DateAndTimeAPI;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantAPI {

    public static void main(String[] args) {

        /*time from 1st Jan 1970 but in nano secs*/
        Instant now = Instant.now();
        System.out.println(now);

        /*atZone : to convert it into any zone*/
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("Australia/Melbourne"));
        System.out.println(zonedDateTime);

    }
}
