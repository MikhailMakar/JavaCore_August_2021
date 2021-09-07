package lessons.lesson11.serialization;

import java.io.Serializable;
import java.util.List;

public class Human implements Serializable {

  public static final long serialVersionUID = 1L;
  private List<Pet> petList;
  private String name;
  private transient int age;
  private static int count;

  public Human(List<Pet> petList, String name) {
    System.out.println("creating human");
    this.petList = petList;
    this.name = name;
    age = 20;
    count++;
  }

  public List<Pet> getPetList() {
    return petList;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Human{" +
        "petList=" + petList +
        ", name='" + name + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Human human = (Human) o;

    if (petList != null ? !petList.equals(human.petList) : human.petList != null) {
      return false;
    }
    return name != null ? name.equals(human.name) : human.name == null;
  }

  @Override
  public int hashCode() {
    int result = petList != null ? petList.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }

  public int getAge() {
    return age;
  }

  public static int getCount() {
    return count;
  }
}
