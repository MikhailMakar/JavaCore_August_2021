package lessons.lesson8.classes;

public class Outer {

  private int value;
  private static int staticValue;

  public void outerMethod() {
//    string;
  }

  public class Inner {

    public static final double PI = 3.14;
    public String string;
    public int value;
    //    static int staticVal; //ERROR
    public void innerMethod() {
      System.out.println(staticValue);
      Outer.this.outerMethod();
      System.out.println(value);
      System.out.println(Outer.this.value);
    }

    public Outer getOuter() {
      return Outer.this;
    }

//    static void staticMethod() { //ERROR
//
//    }
  }

  public static void main(String[] args) {

    Outer outer = new Outer();
    Inner inner = outer.new Inner();

    final double pi = Inner.PI;
  }

}
