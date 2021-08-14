package lessons.lesson13082021;

public class Order {

    static {
        System.out.println("I am from static block as well");
    }

    {
        System.out.println("I am from dynamic block");
    }

    {
        System.out.println("I am from dynamic block too");
    }

    public Order() {
        System.out.println("I am constructor");
    }

    static {
        System.out.println("I am from static block");
    }

    public static void main(String[] args) {
        Order order = new Order();
    }
}
