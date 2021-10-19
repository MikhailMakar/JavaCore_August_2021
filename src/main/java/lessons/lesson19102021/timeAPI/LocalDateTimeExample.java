package lessons.lesson19102021.timeAPI;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println(now.toLocalDate());
        System.out.println(now.toLocalTime());

        LocalDateTime of = LocalDateTime.of(2021, Month.AUGUST, 6, 19, 40);
        System.out.println(of);

        LocalDateTime parse = LocalDateTime.parse("Apr 2021 06 19:22:30", DateTimeFormatter.ofPattern("MMM yyyy dd HH:mm:ss"));
        System.out.println(parse);
        System.out.println(parse.toLocalDate());
    }
}
