package lessons.lesson19102021.timeAPI;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneDateTimeExample {

    public static void main(String[] args) {

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        System.out.println(availableZoneIds);
//        System.out.println(availableZoneIds.size());

        System.out.println(ZoneId.systemDefault());

        ZonedDateTime of = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/Cuiaba"));

        System.out.println(LocalDateTime.now());
        System.out.println(of);
    }
}
