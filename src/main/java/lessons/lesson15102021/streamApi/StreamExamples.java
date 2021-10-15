package lessons.lesson15102021.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> unsortedList = Arrays.asList(2, 5, 4, 12, 6, 1);

        List<Integer> collect = integerList.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

//        System.out.println(collect);

        List<Integer> collect1 = unsortedList.stream()
//                .sorted((o1, o2) -> o2 - o1)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

//        System.out.println(collect1);

        List<Integer> collect2 = Stream.iterate(0, i -> i + 2)
                .limit(10)
                .collect(Collectors.toList());

//        System.out.println(collect2);

        List<Integer> collect3 = Stream.iterate(0, i -> i + 2)
                .takeWhile(i -> i < 20)
                .collect(Collectors.toList());

//        System.out.println(collect3);

        List<Integer> collect4 = Stream.iterate(0, i -> i + 2)
                .dropWhile(i -> i < 20)
                .limit(15)
                .collect(Collectors.toList());

        System.out.println(collect4);
    }
}
