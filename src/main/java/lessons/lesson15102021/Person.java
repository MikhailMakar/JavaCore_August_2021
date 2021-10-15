package lessons.lesson15102021;

import java.util.List;
import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private Computer computer;
    private List<Animal> animals;

    public Person(String name, int age, Computer computer) {
        this.name = name;
        this.age = age;
        this.computer = computer;
    }

    public Person(String name, int age, Computer computer, List<Animal> animals) {
        this.name = name;
        this.age = age;
        this.computer = computer;
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Computer getComputer() {
        return computer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(computer, person.computer) && Objects.equals(animals, person.animals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, computer, animals);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", computer=" + computer +
                ", animals=" + animals +
                '}';
    }
}
