package lessons.lesson12;

public class InnerTry {

  public static void main(String[] args) {
    try {
      int a = args.length;
      int b = 42 / a;
      System.out.println("a = " + a);
      function(a);
    } catch (ArithmeticException e) {
      e.printStackTrace();
      System.out.println("Деление на нуль: "
          + e);
    }

  }

  private static void function(int a) {
    try {
      if (a == 1)
        a = a / (a - a);
      if (a == 2) {
        int с[] = { 1 };
        с[42] = 99;
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();
      System.out.println("Индекс выходит "
          + "за границу массива: " + e);
    }

  }

}
