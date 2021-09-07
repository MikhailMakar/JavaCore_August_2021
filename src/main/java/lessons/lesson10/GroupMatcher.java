package lessons.lesson10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupMatcher {

  public static void main(String[] args) {
    Pattern p = Pattern.compile(
        "J(\\w*)", Pattern.CASE_INSENSITIVE);
    String text =
        "Java is fun; JavaScript is funny.; JFunny ; just";
    Matcher m = p.matcher(text);
    while (m.find()) {
      System.out.println("Found '" + m.group(0)
          + "' at position " + m.start(0)
          + "-" + m.end(0));
      if (m.start(0) < m.end(0))
        System.out.println("Suffix is "
            + m.group(1));

    }



    String test =
        "test a=\"1\" b=\"2\" c=\"3\" bar d=\"4\" e=\"5\"";
    System.out.println(test + "\n");
    Matcher m1 =
        Pattern.compile("([a-z]*)(([ \t]+[a-z]=\"[0-9]\")*)")
            .matcher(test);
    while (m1.find()) {
      System.out.println(m1.group());
      System.out.println(m1.group(1));
      Matcher m2 = Pattern.compile("([a-z])=\"([0-9])\"")
          .matcher(m1.group(2));
      while (m2.find()) {
        System.out.println("  " + m2.group(1)
            + " -> " + m2.group(2));
      }
    }

  }
}
