package lessons.lesson12102021.java8.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<List<String>> anon = new Supplier<List<String>>() {
            @Override
            public List<String> get() {
                return new ArrayList<>();
            }
        };

        Supplier<List<String>> lambda1 = () -> new ArrayList<>();

        Supplier<List<String>> reference = ArrayList::new;

        List<String> list = lambda1.get();
        list.add("Hello!");
        list.add("Hi!");
        list.add("Ola!");
        list.add("Greetings!");
        list.add("Aloha!");

//        for (String s: list) {
//            System.out.println(s);
//        }

        list.forEach(System.out::println);
        System.out.println();
        list.forEach(s -> System.out.println(s));
    }
}
