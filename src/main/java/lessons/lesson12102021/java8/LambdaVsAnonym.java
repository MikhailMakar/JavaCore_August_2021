package lessons.lesson12102021.java8;

public class LambdaVsAnonym {

    public static void main(String[] args) {
        int a = 10;

        // lambda
        Runnable lambda = () -> System.out.println(a);

        // anonymous class
        Runnable anonym = new Runnable() {
            @Override
            public void run() {
                System.out.println(a + 1);
            }
        };

        // static method reference
        Runnable reference = System.out::println;

        lambda.run();
        anonym.run();
        reference.run();

        System.out.println("Th");
    }
}
