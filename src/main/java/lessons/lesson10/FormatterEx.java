package lessons.lesson10;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Timer;

public class FormatterEx {

  public static void main(String[] args) throws FileNotFoundException {
    Formatter formatter = new Formatter("output.txt");

    formatter.format("this is integer %d", 1);
    formatter.flush();
    formatter.close();

    Formatter formatter2= new Formatter();
    boolean b1 = true;
    Boolean b2 = null;
    formatter2.format("1. - %b, %b\n", b1, b2);
    System.out.print(formatter2);
    System.out.println("-------------------------------");
    Timer t = new Timer();
    formatter2.format("2. - %h, %h", t, 25);
    System.out.println(formatter2);
    System.out.println(Integer.toHexString(t.hashCode()));


    formatter2.flush();
    formatter2.close();
  }
}
