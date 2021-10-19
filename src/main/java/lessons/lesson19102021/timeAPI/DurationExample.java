package lessons.lesson19102021.timeAPI;

import java.time.Duration;
import java.time.Instant;

public class DurationExample {

    public static void main(String[] args) {

//        Duration duration = new Duration()

        Duration duration = Duration.ofDays(10);

        System.out.println(duration);

        Duration duration1 = duration.plusDays(12);

        System.out.println(duration1);

        Duration between = Duration.between(Instant.now(), Instant.now().plus(Duration.ofDays(3)));

        System.out.println(between);
    }
}
