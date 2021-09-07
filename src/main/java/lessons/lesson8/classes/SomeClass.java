package lessons.lesson8.classes;

public class SomeClass extends BaseOuter.Inner {

  public SomeClass(BaseOuter outer) {
    outer.super();
  }

  public static void main(String[] args) {
    final double pi = Outer.Inner.PI;

    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();

    Outer.Inner inner1 = new Outer().new Inner();
    final Outer outer1 = inner1.getOuter();

//    new SomeClass(new BaseOuter()).new Inner1(); ERROR
  }

  public void method() {
    final int x = 3;
    class Inner1 {
      void print() {
        System.out.println("x=" + x);
      }
    }
    Inner1 obj = new Inner1();
    obj.print();
  }
}
