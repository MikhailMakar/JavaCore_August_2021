package lessons.lesson7;

public class NotGenericStorage implements Comparable<NotGenericStorage>, Cloneable {

  private Object value;
  private Object[] values;
  private int currentIndex;

  public NotGenericStorage(Object value) {
    this.value = value;
    values = new Object[10];
    values[0] = value;
    currentIndex = 0;
  }

  public Object getValue() {
    return value;
  }

  public int add(Object o) {
    values[++currentIndex] = o;
    return currentIndex;
  }


  @Override
  public int compareTo(NotGenericStorage o) {
    return 0;
  }
}
