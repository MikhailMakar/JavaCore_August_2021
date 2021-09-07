package lessons.lesson10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateUser {

  public static void main(String[] args) {
    Date date = new Date(2007, 12, 13, 16, 40);
    TimeZone timeZone = TimeZone.getTimeZone("Asia/Hong_Kong");
//    Calendar calendar = new GregorianCalendar(date, timeZone);//ERROR
    DateFormat dateFormat = new SimpleDateFormat("HH:MM Z");
//    String string = dateFormat.format(calendar);
//    System.out.println(string);

  }
}
