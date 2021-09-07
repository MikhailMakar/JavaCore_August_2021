package lessons.lesson10;

import lombok.SneakyThrows;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SDFEx {

  @SneakyThrows
  public static void main(String[] args) {
    Date date = new Date();
    // Represents present moment
    Date date1 = new Date(0); // Jan 01 03:00:00 MSK 1970
    SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMMM-yy hh:mm:ss");
    String dateInString = "31-08-1982 10:20:56";
    String dateInString2 = "31-8-1982 10:20:56";
    String dateInString3 = "31-August-82 10:20:56";
    Date date2 = null;
    Date date3 = null;
    Date date4 = null;
    try {
      date2 = sdf.parse(dateInString);
      date3 = sdf1.parse(dateInString2);
      date4 = sdf2.parse(dateInString3);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    System.out.println(date2); //Tue Aug 31 10:20:56 SGT 1982
    System.out.println(date3); //Tue Aug 31 10:20:56 SGT 1982
    System.out.println(date4); //Tue Aug 31 10:20:56 SGT 1982
    System.out.println(date4.getYear());
  }
}
