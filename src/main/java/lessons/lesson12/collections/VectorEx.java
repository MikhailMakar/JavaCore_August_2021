package lessons.lesson12.collections;

import java.util.*;

public class VectorEx {

  public static void main(String[] args) {
    Vector<String> vectorStrings = new Vector<>();

    final boolean string = vectorStrings.add("string");
    vectorStrings.add("1");

    System.out.println(vectorStrings);
    vectorStrings.add(0, "second string");

    System.out.println(vectorStrings);

    final String set_new_string = vectorStrings.set(0, "Set new string");

    System.out.println(vectorStrings);

    System.out.println(set_new_string);

    final List<String> strings1 = Arrays.asList("1", "2", "33");

    vectorStrings.addElement("add by addElement()");
    vectorStrings.addAll(0, strings1);

    System.out.println(vectorStrings);

    System.out.println(vectorStrings.contains("1"));

    System.out.println(vectorStrings.containsAll(strings1));

    System.out.println(vectorStrings.containsAll(Arrays.asList("1", "2", "55")));

    vectorStrings.add("1");
    vectorStrings.add("1");
    vectorStrings.add("1");
    vectorStrings.add("1");
    vectorStrings.add("1");

    System.out.println("before remove: " + vectorStrings);
    vectorStrings.remove("1");
    System.out.println("after remove: " + vectorStrings);

    vectorStrings.removeAll(strings1);

    System.out.println("remove all elements: " + vectorStrings);

    System.out.println(vectorStrings.removeAll(Collections.singleton("1")));

    vectorStrings.add("2");
    vectorStrings.add("2");
    vectorStrings.add("2");
    System.out.println(vectorStrings);
    System.out.println(vectorStrings.indexOf("2"));

    System.out.println(vectorStrings.indexOf("2", 4));

    final String s = vectorStrings.get(4);

    Iterator<String> stringIterable = vectorStrings.iterator();

    while (stringIterable.hasNext()) {
      final String next = stringIterable.next();
      System.out.println(next);

      if (next.equals("2")) {

        stringIterable.remove();
      }
    }
    System.out.println(vectorStrings);

    for (String vectorString : vectorStrings) {
      if (vectorString.equals("string")) {
        vectorStrings.remove(vectorString);
      }
    }

    for (String vectorString : vectorStrings) {

      vectorStrings.remove(vectorString); //ConcurrentModificationException

    }
    System.out.println(vectorStrings);
  }
}
