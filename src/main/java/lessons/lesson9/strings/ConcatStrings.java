package lessons.lesson9.strings;

public class ConcatStrings {

  public static void main(String[] args) {
    String nullStr = null;

    String concat = nullStr + " not null";
    System.out.println(concat);

    final String s = String.copyValueOf(concat.toCharArray());
    final String s1 = new String(concat.toCharArray());
    final String s2 = String.valueOf(concat.toCharArray());


//    nullStr.concat("abc");
    "avc".concat(nullStr);
  }
}