package lessons.lesson12102021.java8.functionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<String, Integer> anon = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        Function<String, Integer> lambda1 = (String str) -> {
            return str.length();
        };

        Function<String, Integer> lambda2 = (str) -> {
            return str.length();
        };

        Function<String, Integer> lambda3 = str -> {
            return str.length();
        };

        Function<String, Integer> lambda4 = str -> str.length();

        Function<String, Integer> reference = String::length;

        System.out.println(lambda4.apply("Hello!"));
    }
}
