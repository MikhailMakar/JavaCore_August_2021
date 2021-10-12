package lessons.lesson12102021.java8.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        UnaryOperator<String> anon = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s + " developer";
            }
        };

        UnaryOperator<String> lambda = str -> str + " developer";

        System.out.println(lambda.apply("Java"));
    }
}
