package lessons.lesson19102021.timeAPI;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();

        System.out.println(now);

        LocalTime of = LocalTime.of(13, 15, 30);

        System.out.println(of);

        System.out.println(of.isBefore(now));

        Duration between = Duration.between(of, now);
        System.out.println(between);

        LocalTime parse = LocalTime.parse("12-55-23", DateTimeFormatter.ofPattern("HH-mm-ss"));
        System.out.println(parse);

        LocalTime plus = parse.plus(Duration.of(4, ChronoUnit.HOURS));
        System.out.println(plus);
    }
}
