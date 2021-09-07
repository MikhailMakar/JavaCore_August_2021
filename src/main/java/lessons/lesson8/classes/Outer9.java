package lessons.lesson8.classes;

public class Outer9 {

  private int x = 3;

  static class ParentNested {

    protected int number;
  }

  static class Inner1 extends ParentNested implements Comparable<BaseOuter.Inner> {

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
    public int compareTo(BaseOuter.Inner o) {
      return 0;
    }
  }

  public void useStatic() {
    Inner1.staticMethod();
  }
}

