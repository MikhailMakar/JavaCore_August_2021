package lessons.lesson11;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SystemStreams {

  public static void main(String[] args) {
    final PrintStream out = System.out;
    out.println("Hello");

    final PrintStream err = System.err;
    err.println("Error");

    final InputStream in = System.in;

    Scanner scanner = new Scanner(in);
    scanner.useDelimiter(";");
    while (scanner.hasNextDouble()){
      System.out.println(scanner.nextDouble());
    }


  }
}
