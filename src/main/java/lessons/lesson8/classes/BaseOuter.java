package lessons.lesson8.classes;

public class BaseOuter {

  abstract class Inner implements Comparable<Outer.Inner> {

    public Inner() {

    }

    @Override
    public int compareTo(Outer.Inner o) {
      return 0;
    }

    abstract void method();
  }

  class Inner2 extends Inner {

    @Override
    void method() {

    }
  }

}
