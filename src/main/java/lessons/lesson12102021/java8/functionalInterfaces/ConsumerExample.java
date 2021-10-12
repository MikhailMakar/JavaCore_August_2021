package lessons.lesson12102021.java8.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> anon = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        Consumer<String> lambda1 = (String str) -> {
            System.out.println(str);
        };

        Consumer<String> lambda2 = (str) -> {
            System.out.println(str);
        };

        Consumer<String> lambda3 = str -> System.out.println(str);

        Consumer<String> reference = System.out::println;

        anon.accept("Java developer!");
    }
}
