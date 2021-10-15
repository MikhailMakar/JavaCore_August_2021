package lessons.lesson15102021.streamApi;

import lessons.lesson15102021.Animal;
import lessons.lesson15102021.Person;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static lessons.lesson15102021.Persons.getPersonList;

public class TerminalOperations {

    public static void main(String[] args) {

        IntStream intStream = getPersonList().stream()
                .mapToInt(person -> person.getAnimals().size());

        int sum = intStream.sum();
//        System.out.println(sum);

        IntSummaryStatistics intSummaryStatistics = getPersonList().stream()
                .mapToInt(person -> person.getAnimals().size())
                .summaryStatistics();

        System.out.println(intSummaryStatistics);

        Optional<Person> any = getPersonList().stream()
                .findAny();

        Optional<Person> first = getPersonList().stream()
                .findFirst();

        System.out.println(getPersonList().stream()
                .anyMatch(person -> person.getName().equals("Anna")));

        System.out.println(getPersonList().stream()
                .allMatch(person -> person.getAnimals().size() > 0));

        Optional<String> resultString = getPersonList().stream()
                .map(Person::getName)
                .reduce((s1, s2) -> s1 + "; " + s2);

        resultString.ifPresent(System.out::println);

        Integer sumOfAges = getPersonList().stream()
                .flatMap(person -> person.getAnimals().stream())
                .map(Animal::getAge)
                .reduce(0, (integer1, integer2) -> integer1 + integer2);

        System.out.println(sumOfAges);

        System.out.println("===========");

        getPersonList().parallelStream()
                .peek(person -> System.out.println(Thread.currentThread().getName()))
                .flatMap(person -> person.getAnimals().stream())
                .map(Animal::getAge)
                .reduce(0, (integer, integer2) -> integer + integer2, (integer, integer2) -> integer + integer2);

        IntStream.range(0, 20).forEach(System.out::println);
        IntStream.rangeClosed(0, 20).forEach(System.out::println);

        Stream<Integer> integerStream = IntStream.range(0, 20)
                .boxed();

        System.out.println("=======================");
        integerStream.forEach(System.out::println);
    }
}
