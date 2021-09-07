package lessons.lesson12;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BaseCl {

  public BaseCl()
      throws IOException, ArithmeticException {
  }

  public static void methodA()
      throws IOException {
  }

}

class DerivativeCl extends BaseCl {

  public DerivativeCl()
      throws EOFException, IOException,
      ArithmeticException, NullPointerException,
      FileNotFoundException,
      ClassNotFoundException {
    super();

    throw new ClassNotFoundException();
  }

  public static void methodA()
      throws EOFException {
  }
}

class DerivativeCl2 extends BaseCl {

  // ошибок компиляции нет
  public DerivativeCl2() throws Exception {
    super();
  }

  // compile error
//  public static void methodA()
//      throws Exception {
//  }
}
