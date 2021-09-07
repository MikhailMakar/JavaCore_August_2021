package lessons.lesson11.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializeIt {

  public static void main(String[] args) throws IOException, ClassNotFoundException {

    Pet cat = new Pet("Barsik", 3);
    Pet dog = new Pet("Sharik", 10);

    List<Pet> petList = new ArrayList<>();

    petList.add(cat);
    petList.add(dog);

    Human human = new Human(petList, "Vasya");
    cat.setMyHuman(human);

    FileOutputStream fos = new FileOutputStream("human");
    ObjectOutputStream outputStream = new ObjectOutputStream(fos);

    outputStream.writeObject(human);
    outputStream.close();

    FileInputStream fileInputStream = new FileInputStream("human");
    ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

    final Object deserialized = inputStream.readObject();

    if (deserialized instanceof Human) {
      System.out.println((Human) deserialized);
      System.out.println(human.equals(deserialized));
      System.out.println(human == deserialized);
      System.out.println(((Human) deserialized).getAge());
      System.out.println(Human.getCount());
    }
    final ArrayList<Pet> cats = new ArrayList<>();
    cats.add(cat);
    cats.add(cat);
    Human with2cats = new Human(cats, "CatHolder");

    FileOutputStream fos2 = new FileOutputStream("cat");
    ObjectOutputStream outputStream1 = new ObjectOutputStream(fos2);

    outputStream1.writeObject(cat);

    FileOutputStream fos3 = new FileOutputStream("cats");
    ObjectOutputStream outputStream2 = new ObjectOutputStream(fos3);

    outputStream2.writeObject(cat);
    outputStream2.reset();
    outputStream2.writeObject(cat);

    outputStream1.close();
    outputStream2.close();

  }

}
