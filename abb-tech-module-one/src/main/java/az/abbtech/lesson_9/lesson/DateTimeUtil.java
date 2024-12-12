package az.abbtech.lesson_9.lesson;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeUtil {
    private DateTimeUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static void main(String[] args) {
//        testTime();
        formatTime();
    }

    public static void testTime() {
        LocalTime now = LocalTime.now();
        var customLocalTime = LocalTime.of(10, 40, 59);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(now);
        System.out.println(customLocalTime);
        System.out.println(dateTime);

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2020, 1, 2);
        var periodAsDays = Period.between(date2, date1).getDays();
        System.out.println(periodAsDays);

        var daysBetween = ChronoUnit.DAYS.between(date2, date1);
        System.out.println(daysBetween);

    }

    public static void formatTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MMMM-dd-EEEE HH:mm:ss:SSS");
        String formattedDate = dateTimeFormatter.format(localDateTime);

        System.out.println("Before format: " + localDateTime);
        System.out.println("After format: " + formattedDate);


    }
}
