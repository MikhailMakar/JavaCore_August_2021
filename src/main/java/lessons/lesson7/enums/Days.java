package lessons.lesson7.enums;

public enum Days {

  MONDAY("Monday", 1) {
    @Override
    public void action() {
      System.out.println("It's monday");
    }

    public Days getNext() {
      final int ordinal = this.ordinal();
      final Days[] values = Days.values();
      if ((values.length - 1) == ordinal) {
        return values[0];
      } else {
        return values[ordinal + 1];
      }
    }
  },
  TUESDAY("Tuesday", 2) {

  },
  WEDNESDAY("Wednesday", 3) {

  };
  private String value;
  private int dayOfWeek;

  public String getValue() {
    return value;
  }

  Days(String value, int dayOfWeek) {
    this.value = value;
    this.dayOfWeek = dayOfWeek;
  }

  public void action() {
    System.out.println("It's some day of the week");
  }

  public class A {

  }
  public Days getNext() {
    return null;
  }

}
