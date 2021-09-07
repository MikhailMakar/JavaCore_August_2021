package lessons.lesson10;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleEx {

  public static void main(String[] args) {
    final Locale aDefault = Locale.getDefault();
    System.out.println(aDefault);

    final Locale[] availableLocales = Locale.getAvailableLocales();

    for (Locale availableLocale : availableLocales) {
      System.out.println(availableLocale);
      System.out.println(availableLocale.getLanguage());
      System.out.println(availableLocale.getDisplayLanguage());
      System.out.println(availableLocale.getCountry());
      System.out.println(availableLocale.getDisplayCountry());
      System.out.println("===================");
    }

    NumberFormat defaultFormatter = NumberFormat.getNumberInstance();
    NumberFormat frFormatter = NumberFormat.getNumberInstance(Locale.FRANCE);
    NumberFormat japFormatter = NumberFormat.getNumberInstance(Locale.JAPANESE);

    int[] numbers = {100, 1000, 1000000000};

    for (int number : numbers) {
      System.out.println(defaultFormatter.format(number));
      System.out.println(frFormatter.format(number));
      System.out.println(japFormatter.format(number));
    }

  }
}
