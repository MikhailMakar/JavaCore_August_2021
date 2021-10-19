package lessons.lesson19102021.timeAPI;

import java.time.Instant;
import java.util.Date;

public class InstantExample {

    public static void main(String[] args) {

//        Instant instant = new Instant()

        Instant instant = Instant.now();

        System.out.println(instant);

        Date date = new Date();
        Instant instant1 = Instant.ofEpochMilli(date.getTime());
        System.out.println("from Date: " + instant1);

        Instant instant2 = instant.plusSeconds(100);

        System.out.println(instant2);

        System.out.println(instant.toEpochMilli());
    }
}
