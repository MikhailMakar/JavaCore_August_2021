package lessons.lesson8.classes;

import lesson2021_02_25.classes.Outer.Inner;

import static lesson2021_02_25.classes.Outer9.Inner1.staticMethod;

public class Outer9 {

  private int x = 3;

  static class ParentNested {

    protected int number;
  }

  static class Inner1 extends ParentNested implements Comparable<Inner> {

    static int value;
    {
      System.out.println(number);
    }

    public void method() {
      System.out.println(number);
      Outer9 out = new Outer9();
      System.out.println("out.x=" + out.x);
    }

    public static void staticMethod() {

    }

    @Override
    public int compareTo(Inner o) {
      return 0;
    }
  }

  public void useStatic() {
    staticMethod();
  }
}

