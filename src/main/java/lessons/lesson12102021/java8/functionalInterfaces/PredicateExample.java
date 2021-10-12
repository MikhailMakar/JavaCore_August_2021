package lessons.lesson12102021.java8.functionalInterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<String> anon = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isEmpty();
            }
        };

        Predicate<String> lambda1 = (String str) -> {
            return str.isEmpty();
        };

        Predicate<String> lambda2 = (str) -> {
            return str.isEmpty();
        };

        Predicate<String> lambda3 = str -> {
            return str.isEmpty();
        };

        Predicate<String> lambda4 = str -> str.isEmpty();

        Predicate<String> reference = String::isEmpty;

        System.out.println(lambda4.test("Hello!"));
    }
}
