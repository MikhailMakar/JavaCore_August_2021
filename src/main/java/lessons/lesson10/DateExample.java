package lessons.lesson10;

import java.util.Date;

public class DateExample {

  public static void main(String[] args) {

    Date date = new Date(10000);
    System.out.println(date);
    System.out.println(System.currentTimeMillis());
    System.out.println(System.currentTimeMillis());
    System.out.println(System.currentTimeMillis());

    final Date date1 = new Date(121, 2, 4);

    System.out.println(date1);

    Date after = new Date(5000);
    Date before = new Date(50000);

    System.out.println(date.before (before));
    System.out.println(date.after(after));

    System.out.println(date.getTime());
  }
}
