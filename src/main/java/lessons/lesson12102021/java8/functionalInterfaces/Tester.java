package lessons.lesson12102021.java8.functionalInterfaces;

@FunctionalInterface
interface MyFunctionalInterface {

    int method();
}

public class Tester {

    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterface() {
            @Override
            public int method() {
                return 23;
            }
        };

        MyFunctionalInterface lambda = () -> 4;
    }
}
