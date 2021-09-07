package lessons.lesson12;

public class TryCatchBasic {

  public static void main(String[] args) {
    int a = 42;

    int d = 0;

    try {
      int c = a / d;
    } catch (ArithmeticException e) {
      e.printStackTrace();
    }

    System.out.println("After try catch");
  }
}
