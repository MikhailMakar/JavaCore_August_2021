package lessons.lesson03092021.comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
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
    public int compareTo(Person person) {
        int i = this.name.compareTo(person.name);
        if (i != 0) {
            return i;
        } else {
            return this.age - person.age;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Checker {
    public static void main(String[] args) {
        Person john = new Person("John", 16);
        Person ivan = new Person("Ivan", 23);
        Person david = new Person("David", 13);
        Person pavel = new Person("David", 15);
        Person andrei1 = new Person("Andrey", 34);
        Person andrei2 = new Person("Andrey", 22);
        Person andrei3 = new Person("Andrey", 26);


        Person[] persons = {john, ivan, david, pavel, andrei1, andrei2, andrei3};
        Arrays.sort(persons);
//        System.out.println(Arrays.toString(persons));

        Comparator<Person> comparatorByAgeDesc = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
        };

        Comparator<Person> comparatorByName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(persons, comparatorByName.thenComparing(comparatorByAgeDesc));
        System.out.println(Arrays.toString(persons));
    }
}
