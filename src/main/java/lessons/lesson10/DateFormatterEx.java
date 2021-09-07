package lessons.lesson10;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatterEx {

  public static void main(String[] args) {
    Date date = new Date();
    DateFormat dfUSLong =
        DateFormat.getDateInstance(
            DateFormat.LONG, Locale.US);
    DateFormat dfUSShort = 	DateFormat.getDateInstance(
        DateFormat.SHORT, Locale.US);
    DateFormat dfUSMid = 	DateFormat.getDateInstance(
        DateFormat.MEDIUM, Locale.US);
    DateFormat dfUSdef = 	DateFormat.getDateInstance(
        DateFormat.DEFAULT, Locale.US);
    DateFormat dfUSFull = DateFormat.getDateInstance(
        DateFormat.FULL, Locale.US);

    System.out.println("long: " + dfUSLong.format(date));
    System.out.println("Short: " + dfUSShort.format(date));
    System.out.println("default: " + dfUSdef.format(date));
    System.out.println("full: " + dfUSFull.format(date));
    System.out.println("medium: " + dfUSMid.format(date));

  }
}
