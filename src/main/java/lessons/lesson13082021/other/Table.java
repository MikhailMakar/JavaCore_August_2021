package lessons.lesson13082021.other;

import lessons.lesson13082021.Order;
import lessons.lesson13082021.other2.TestMain;

import java.io.IOException;
import java.time.LocalDate;

public class Table extends TestMain {

    public Table(LocalDate localDate) {
        super(localDate);
    }

    Order order = new Order();

    {
        order = new Order();
    }

    public static void main(String[] args) {
        Table table = new Table(LocalDate.now());
        System.out.println(table.getLocalDate());
//        throw  new IOException();
    }




}
