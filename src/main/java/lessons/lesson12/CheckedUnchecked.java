package lessons.lesson12;

import java.io.FileNotFoundException;

public class CheckedUnchecked {

  public static void main(String[] args) {

    unchecked();

    try {
      checked();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }

  private static void checked() throws ClassNotFoundException, FileNotFoundException {
    if(true) {
      throw new ClassNotFoundException();
    }
    else {
      throw new FileNotFoundException();
    }
  }

  private static void unchecked() {
    throw new NullPointerException();
  }

}
