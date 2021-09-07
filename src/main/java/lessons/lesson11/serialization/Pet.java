package lessons.lesson11.serialization;

import java.io.Serializable;

public class Pet implements Serializable {

  private String name;
  private int age;
  private Human myHuman;

  public void setMyHuman(Human myHuman) {
    this.myHuman = myHuman;
  }

  public Pet(String name, int age) {
    System.out.println("Creating pet");
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Pet{" +
        "name='" + name + '\'' +
        ", age=" + age +
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

    Pet pet = (Pet) o;

    if (age != pet.age) {
      return false;
    }
    return name != null ? name.equals(pet.name) : pet.name == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + age;
    return result;
  }
}
