package lessons.lesson19102021.timeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate of = LocalDate.of(2021, Month.APRIL, 4);
        LocalDate of1 = LocalDate.of(2021, 4, 4);
        System.out.println(of);
        System.out.println(of1);

        LocalDate localDate = LocalDate.ofEpochDay(5);
        System.out.println(localDate);

        LocalDate from = LocalDate.from(LocalDateTime.now());
        System.out.println(from);

        LocalDate with = from.with(TemporalAdjusters.firstDayOfYear());
        System.out.println(with);
    }
}
