package lessons.lesson12;

public class FinallyBlock {

  public static void main(String[] args) {

    try {
      procA();
    } catch (Exception e) {
      System.out.println("Исключение выброшено");
    }
    procB();
    procC();



    System.out.println(doSnmth());



  }

  static int doSnmth() {

    try {
      return 5;
    } finally {
      System.out.println("from method");
//      return 10;
    }
  }


  static void procA() {
    try {
      System.out.println("Внутри procA");
      throw new RuntimeException("demo");
    } finally {
      System.out.println("finally для procA ");
    }
  }

  static void procB() {
    try {
      System.out.println("Внутри procB");
      return;
    } finally {
      System.out.println("finally для procB ");
    }
  }

  static void procC() {
    try {
      System.out.println("Внутри procC");
    } finally {
      System.out.println("finally procC");
    }
  }

}
