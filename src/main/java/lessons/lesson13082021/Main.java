package lessons.lesson13082021;

import lessons.lesson13082021.other.Table;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    private int i = 10;
    protected LocalDate localDate = LocalDate.now();
    static LocalDate localDate2 = LocalDate.of(2021, Month.AUGUST, 12);

    public int getI() {
        return i;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Table table = new Table();
        lessons.lesson13082021.Table table1 = new lessons.lesson13082021.Table();
        System.out.println();
        System.out.println("localDate2 = " + localDate2);
    }

    protected LocalDate getLocalDate() {
        return localDate;
    }
}
