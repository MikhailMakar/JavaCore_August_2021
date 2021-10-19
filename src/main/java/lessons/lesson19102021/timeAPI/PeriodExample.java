package lessons.lesson19102021.timeAPI;

import java.time.Period;

public class PeriodExample {

    public static void main(String[] args) {

        Period period = Period.of(0, 0, 5);
        System.out.println(period);

        Period period1 = period.plusMonths(30);
        System.out.println(period1);
        System.out.println(period1.normalized());

        Period period2 = Period.ofWeeks(3).ofDays(3);
        System.out.println(period2);


    }
}
