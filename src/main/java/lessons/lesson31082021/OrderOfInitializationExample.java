package lessons.lesson31082021;

public class OrderOfInitializationExample {

    static {
        System.out.println("I am from static block 1");
    }

    public OrderOfInitializationExample() {
        System.out.println("I am from constructor");
    }

    {
        System.out.println("I am from non-static block 1");
    }

    {
        System.out.println("I am from non-static block 2");
    }

    {
        System.out.println("I am from non-static block 3");
    }

    static {
        System.out.println("I am from static block 2");
    }

    {
        System.out.println("I am from non-static block 4");
    }

    public static void main(String[] args) {
        new OrderOfInitializationExample();
    }
}
