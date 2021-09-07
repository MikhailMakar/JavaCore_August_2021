package lessons.lesson12;

public class BadPractice {

  public static void main(String[] args) {
    int i = 0;
    try {
      if (args[1].equals("0")) {
        i = 2;
      }
      if (args[1].equals("1")) {
        i = 3;
      }
    } catch (Exception e) {
      i = 4;
    }

    System.out.println(i);
  }
}
