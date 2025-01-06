package Java8Concept.DateAndTimeAPI;

import java.time.LocalDateTime;

public class LocalDateTImeAPI {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime parse = LocalDateTime.parse("2024-12-12T13:35:10.546982800");

    }
}
