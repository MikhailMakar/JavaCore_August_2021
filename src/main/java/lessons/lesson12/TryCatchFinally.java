package lessons.lesson12;

public class TryCatchFinally {

  public static void main(String[] args) {
    try {

    } catch (Exception e) {

    }

    try {

    } catch (Exception e) {

    } finally {

    }

    try {
      throw new IllegalArgumentException();
    } finally {
      System.err.println("from finally");
    }
  }
}
