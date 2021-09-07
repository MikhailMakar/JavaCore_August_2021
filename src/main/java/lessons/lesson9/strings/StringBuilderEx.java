package lessons.lesson9.strings;

public class StringBuilderEx {

  public static void main(String[] args) {

    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder fromString = new StringBuilder("abc");
    StringBuilder emptySB = new StringBuilder();
    emptySB.setLength(5);
    emptySB.append("dfsd");

    System.out.println(emptySB.capacity());

    emptySB.trimToSize();

    System.out.println(emptySB.capacity());
    stringBuilder.append(fromString);

    final StringBuilder append = stringBuilder.append("abc")
        .append("string")
        .append("java");

    final StringBuilder append1 = stringBuilder.append("abc");
    append1.append("string");
    append1.append("java");
  }
}
