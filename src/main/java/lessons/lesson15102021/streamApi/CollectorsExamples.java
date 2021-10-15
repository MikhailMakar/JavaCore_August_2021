package lessons.lesson15102021.streamApi;

import lessons.lesson15102021.Computer;
import lessons.lesson15102021.Person;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static lessons.lesson15102021.Persons.getPersonList;

public class CollectorsExamples {

    public static void main(String[] args) {

        List<Computer> collect = getPersonList().stream()
                .map(p -> p.getComputer())
                .collect(Collectors.toList());

        Set<Computer> collect1 = getPersonList().stream()
                .map(Person::getComputer)
                .collect(Collectors.toSet());

//        System.out.println(collect);
//        System.out.println(collect1);

//        Map<String, Computer> collect2 = getPersonList().stream()
//                .collect(Collectors.toMap(
//                        p -> p.getName(),
//                        p -> p.getComputer()
//                ));

        Map<String, Computer> collect3 = getPersonList().stream()
                .collect(Collectors.toMap(
                        Person::getName,
                        Person::getComputer,
                        (computer1, computer2) -> computer1
                ));

//        System.out.println(collect3);

        TreeMap<String, Computer> collect4 = getPersonList().stream()
                .collect(Collectors.toMap(
                        Person::getName,
                        Person::getComputer,
                        (computer1, computer2) -> computer1,
                        () -> new  TreeMap<>()
                ));

//        System.out.println(collect4);

        String resultString = getPersonList().stream()
                .map(person -> person.getName())
                .collect(Collectors.joining());

        System.out.println(resultString);

        String resultStringWithSeparator = getPersonList().stream()
                .map(person -> person.getName())
                .collect(Collectors.joining("; "));

        System.out.println(resultStringWithSeparator);

        String resultStringWithSeparator2 = getPersonList().stream()
                .map(person -> person.getName())
                .collect(Collectors.joining("; ", "{", "}"));

        System.out.println(resultStringWithSeparator2);
        System.out.println();

        Map<String, List<Person>> collect2 = getPersonList().stream()
                .collect(Collectors.groupingBy(
                        person -> person.getName()
                ));

//        System.out.println(collect2);

        TreeMap<String, Set<Person>> collect6 = getPersonList().stream()
                .collect(Collectors.groupingBy(
                        Person::getName,
                        () -> new TreeMap<>(),
                        Collectors.toSet()
                ));

//        System.out.println(collect6);

        Map<Boolean, List<Person>> collect5 = getPersonList().stream()
                .collect(Collectors.partitioningBy(
                        person -> person.getAnimals().size() > 1
                ));

        System.out.println(collect5);
    }
}
