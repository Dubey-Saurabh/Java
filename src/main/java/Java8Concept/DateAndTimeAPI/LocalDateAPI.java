package Java8Concept.DateAndTimeAPI;

import java.time.LocalDate;

public class LocalDateAPI {

    public static void main(String[] args) {

        /*now: to get today time
         * of: to make custom date
         * get: to get day, month and year
         * minusDays: previous days
         * minusMonths: previous months
         * isAfter: check a day is after*/

        /*today*/
        LocalDate today = LocalDate.now();
        System.out.println(today);

        /*of*/
        LocalDate customDate = LocalDate.of(2022, 03, 12);
        System.out.println(customDate);

        /*get*/
        int year = today.getYear();
        int month = today.getMonthValue();
        int dayOfMonth = today.getDayOfMonth();
        System.out.println(year);
        System.out.println(month);
        System.out.println(dayOfMonth);

        /*minus*/
        LocalDate yesterday = today.minusDays(1);
        System.out.println(yesterday);

        LocalDate localDate1 = today.minusMonths(100);
        System.out.println(localDate1);

        /*isAfter*/
        if (today.isAfter(yesterday)) {
            System.out.println("Yes");
        }


    }
}
