package lessons.lesson10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpEx {

  public static void main(String[] args) {

    String str = "Мама мыла раму";

    String pattern = "^[о-яО-Я].+";

    System.out.println(str.matches(pattern));

    String email = "some_email@gmail.com";
    String email2 = "some_emailw@mail.ru";

    String emailPattern = "(\\D{0,5}_\\D{5})@(gmail.com|mail.ru)";

    System.out.println(email.matches(emailPattern));
    System.out.println(email2.matches(emailPattern));

    Pattern pattern1 = Pattern.compile(emailPattern);

    Matcher matcher = pattern1.matcher(email);

//

    while (matcher.find()){
      System.out.println(matcher.group());
      System.out.println(matcher.group(2));
      System.out.println(matcher.groupCount());
    }
  }
}
