package lessons.lesson12102021.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> collect = Stream.generate(() -> random.nextInt())
                .limit(10)
                .collect(Collectors.toList());

        List<Integer> collect1 = Stream.iterate(1, a -> a < 20, integer -> integer + 2)
                .collect(Collectors.toList());

//        collect.forEach(System.out::println);
//        System.out.println();
//        collect1.forEach(System.out::println);

        List<Integer> collect2 = Stream.of(1, 2, 4, 56, -45, 1232)
                .collect(Collectors.toList());

        List<Integer> collect3 = collect2.stream()
                .sorted()
                .collect(Collectors.toList());

//        collect3.forEach(System.out::println);

        List<String> stringList = Arrays.asList("str1", "str123123", "sasda", "s", "sdf");

        List<Integer> collect4 = stringList.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

//        System.out.println(collect4);

        List<String> stringList2 = Arrays.asList("s1", "nmn", "tnt", "ac/dc", "sdf");

        Stream<List<String>> listStream = Stream.of(stringList, stringList2);

        List<String> collect5 = listStream
                .flatMap(strings -> strings.stream())
                .filter(str -> str.length() > 3)
                .collect(Collectors.toList());

        System.out.println(collect5);
    }
}
