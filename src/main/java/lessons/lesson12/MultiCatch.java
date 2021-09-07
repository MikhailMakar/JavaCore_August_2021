package lessons.lesson12;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MultiCatch {

  public static void main(String[] args) {
    int a;
    try {
      a = args.length;
      int b = 42 / a;
      int[] c = new int[a];
      c[a] = 666;
    } catch (ArithmeticException e) {
      System.out.println("Деление на ноль." + e);
    } catch (ArrayIndexOutOfBoundsException e){
      e.printStackTrace();
    }
    System.out.println("Уже после блока try-catch-catch.");


    try{
      throw1();
      throw2();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (Exception e){
      e.printStackTrace();
    }

  }


  static void throw1() throws FileNotFoundException {

  }

  static void throw2() throws IOException {

  }
}
