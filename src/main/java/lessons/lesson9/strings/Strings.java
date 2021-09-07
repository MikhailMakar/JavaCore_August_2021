package lessons.lesson9.strings;

import java.util.Arrays;

public class Strings {

  static char c = 'A';
  static int anInt;
  static double aDouble;

  public static void main(String[] args) {

    String srt = "Маша мыла раму";

    srt.substring(1);
    char[] chars = new char[10];
    System.out.println();
    System.out.println(anInt);
    System.out.println(aDouble);
    srt.getChars(2, 5, chars, 0);

    System.out.println(Arrays.toString(chars));

    String emptyStr = "";
    String spaceStr = "\t";
    System.out.println(emptyStr.isEmpty());
    System.out.println(spaceStr.isEmpty());
    System.out.println(spaceStr.isBlank());

    char ch = '现';
    System.out.println(ch == 0x73b0); // "+" - что бы поместить char в числовой контекст
    System.out.println((Integer.toHexString(ch) == ("73b0")));
    String str = new String(new char[]{ch}).intern();
    System.out.println((str.length() == 1));
    byte[] bytes = str.getBytes();
    System.out.println((bytes.length == 3));
    System.out.println((bytes[0] == (byte) 0xe7));
    System.out.println((bytes[1] == (byte) 0x8e));
    System.out.println((bytes[2] == (byte) 0xb0));

    String strToTrim = "    Мама мыла раму    ";

    System.out.println(strToTrim);

    System.out.println(strToTrim.trim());

    System.out.printf(
        "integer is %d, float is %f, string is %s, second string is %<s, next integer is %1$d", 1,
        1.0, "строка");


  }
}
