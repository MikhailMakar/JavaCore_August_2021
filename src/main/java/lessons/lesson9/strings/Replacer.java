package lessons.lesson9.strings;

import java.util.Arrays;

public class Replacer {

  public static void main(String[] args) {
    String toReplace = "Car623423Pot7Gun11";

    final String s = toReplace.replaceAll("\\d+", ";");
    final String s2 = toReplace.replaceAll("\\D+", ";");
    final String s3 = toReplace.replaceAll("Car", "Cat");

    final String[] s4 = toReplace.split("\\d+",2);

    System.out.println(s);
    System.out.println(s2);
    System.out.println(s3);

    System.out.println(Arrays.toString(s4));
  }
}
