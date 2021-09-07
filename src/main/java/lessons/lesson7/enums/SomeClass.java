package lessons.lesson7.enums;

public class SomeClass {

  public static void main(String[] args) {

    Faculty current;
    current = Faculty.GEO;
    switch (current) {
      case GEO:
        System.out.print(current);
        break;
      case MMF:
        System.out.print(current);
        break;
// case LAW : System.out.print(current);//error
      default:
        System.out.print("вне case: " + current);
    }
  }
}
