package lessons.lesson7;

public class GenericStorage<T extends Comparable<T>> {

  T value;

  public GenericStorage(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  public boolean compare(GenericStorage<?> genericStorage) {

    return getValue().equals(genericStorage.getValue());
  }
}
