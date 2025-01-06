package Java8Concept.DateAndTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneDateTimeAPI {

    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        /*getAvailableZoneIds*/
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(x-> System.out.println(x));

        /*get time of anywhere else*/
        ZonedDateTime now1 = ZonedDateTime.now(ZoneId.of("Australia/Melbourne"));
        System.out.println(now1);

        /*getZone*/
        ZoneId zone = now.getZone();
        System.out.println(zone);

    }
}
