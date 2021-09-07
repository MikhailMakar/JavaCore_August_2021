package lessons.lesson10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class UnicodEx {

  public static void main(String[] args)  {

    PrintWriter printWriter = null;
    PrintWriter printWriter16BE = null;
    PrintWriter printWriter16LE = null;
    try {
      printWriter = new PrintWriter("ex.txt");
      printWriter16BE = new PrintWriter("ex16BE.txt", StandardCharsets.UTF_16BE);
      printWriter16LE = new PrintWriter("ex16LE.txt", StandardCharsets.UTF_16LE);
      printWriter.write('\ufeef');
      printWriter16BE.write('\ufeef');
      printWriter16LE.write('\ufeef');

      printWriter.write("hello");
      printWriter16BE.write("hello");
      printWriter16LE.write("hello");

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        printWriter.close();
        printWriter16BE.close();
        printWriter16LE.close();
        throw new IOException();
      } catch (IOException io) {
        io.printStackTrace();
      }
    }

    try(PrintWriter pw = new PrintWriter("text.txt")) {
      pw.write("some");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
