package lessons.lesson15102021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Persons {

    public static List<Person> getPersonList() {
        List<Person> people = Arrays.asList(
                new Person("Petr",
                        22,
                        new Computer(new Processor("intel i5")), Arrays.asList(
                        new Animal("Barsik", 2)
                )),
                new Person("Foma",
                        15,
                        new Computer(new Processor("intel i7")), Arrays.asList(
                        new Animal("Pushok", 6), new Animal("Sharik", 11)
                )),
                new Person("Anna",
                        22,
                        new Computer(new Processor("intel i999")), Arrays.asList(
                        new Animal("Bobik", 15)
                )),
                new Person("Anna",
                        22,
                        new Computer(new Processor("intel i999")), Arrays.asList(new Animal("Bobik", 15)))

        );

        List<Person> personList = new ArrayList<>(people);
        return personList;
    }
}
