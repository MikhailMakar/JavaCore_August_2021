package lessons.lesson7.enums;

import java.time.Month;

public class WithoutEnum {

  private static final String MONDAY = "Monday";
  private static final String TUESDAY = "Tuesday";

  public static void main(String[] args) throws ClassNotFoundException {

    getDay(MONDAY);
    getDay("Saturday");
    final Days monday = Days.MONDAY;
    System.out.println(monday.compareTo(Days.TUESDAY));
    Days.WEDNESDAY.action();
    Days.MONDAY.action();

    Days.A a =  Days.MONDAY.new A();

    System.out.println(Days.valueOf("MONDAY"));

    final Days[] values = Days.values();

    for (Days value : values) {
      System.out.println(value);
    }
    Class<Month> monthClass = (Class<Month>) Class.forName("java.time.Month");
    final Month september = Days.valueOf(monthClass, "SEPTEMBER");
    System.out.println(september);

    System.out.println(Days.MONDAY.getValue() + Days.MONDAY.getValue());

    System.out.println(Days.MONDAY.getNext());
  }

  private static void getDay(String string) {

    switch (string) {
      case "Monday":
        System.out.println("It's monday");
        break;
      case "Tuesday":
        System.out.println("It's tuesday");
        break;
    }
  }
}
