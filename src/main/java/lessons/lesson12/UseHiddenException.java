package lessons.lesson12;

public class UseHiddenException {

  public static double salary(int coeff)
      throws HiddenException {
    double d;
    try {
      if ((d = 10 - 100 / coeff) < 0) {
        throw new HiddenException("negative salary");
      } else {
        return d;
      }
    } catch (ArithmeticException e) {
      throw new HiddenException("div by zero", e);
    }
  }

  public static void main(String[] args) {
    try {
      double res = salary(0); //или 0, или 71;
    } catch (HiddenException e) {
      System.err.println(e.toString());
      System.err.println(e.getHiddenException());
    }
  }

}

