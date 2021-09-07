package lessons.lesson8.classes;

public class Human {

  private String name;
  private int age;
  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }


  public void printHuman() {
    System.out.println("name: " + name + "; age: " + age);
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

