package lessons.lesson13;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionsEx {
    public static void main(String[] args) {
        List<String> objects = Arrays.asList("1","2","3");

//        objects.remove("1");//ERROR


        Set<Integer> singleton = Collections.singleton(1);

        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("5");
        list.add("7");
        list.add("3");

//        list.removeAll(objects);
        list.retainAll(objects);
        System.out.println(list);

        List<String> collect = list.stream()
                .map(s -> Integer.valueOf(s))
                .filter(integer -> integer > 2)
                .map(integer -> String.valueOf(integer))
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
