package lessons.lesson11.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialized {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    FileInputStream fileInputStream = new FileInputStream("human");
    ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

    final Object deserialized = inputStream.readObject();

    if (deserialized instanceof Human) {
      System.out.println((Human) deserialized);
      System.out.println(((Human) deserialized).getAge());
      System.out.println(Human.getCount());
    }
  }
}
