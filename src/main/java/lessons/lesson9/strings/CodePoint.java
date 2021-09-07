package lessons.lesson9.strings;

import java.util.Arrays;

public class CodePoint {

  public static void main(String[] args) {

    char ch = '现';

    System.out.println(ch == 0x73b0); // "+" - что бы поместить char в числовой контекст
    System.out.println((Integer.toHexString(ch).equals("73b0")));
    System.out.println(Integer.toHexString(ch));
    System.out.println("============");
    String str = new String(new char[]{ch}).intern();
    System.out.println((str.length() == 1));
    System.out.println(str);
    System.out.println("============");
    byte[] bytes = str.getBytes();
    System.out.println(Arrays.toString(bytes));
    System.out.println((bytes.length == 3));
    System.out.println((bytes[0] == (byte) 0xe7));
    System.out.println((bytes[1] == (byte) 0x8e));
    System.out.println((bytes[2] == (byte) 0xb0));



    String hello = "Hello", lo = "lo";
    System.out.print((hello == "Hello") + " ");
    System.out.print((hello == ("Hel" + "lo")) + " ");
    System.out.print((hello == ("Hel" + lo)) + " ");
    System.out.println(hello == ("Hel" + lo).intern());

  }
}
