package lessons.lesson12.collections;

public class Key {

  private int i;
  private double aDouble;

  public int getI() {
    return i;
  }

  public void setI(int i) {
    this.i = i;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Key key = (Key) o;

    if (i != key.i) {
      return false;
    }
    return Double.compare(key.aDouble, aDouble) == 0;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = i;
    temp = Double.doubleToLongBits(aDouble);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "Key{" +
        "i=" + i +
        '}';
  }
}
