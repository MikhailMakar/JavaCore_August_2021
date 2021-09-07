package lessons.lesson12;

public class UseMyEx {

  public static void main(String[] args) {
    try {
      throw new MyException("my exception");
    } catch (MyException e) {
      e.printStackTrace();
    }
  }
}
