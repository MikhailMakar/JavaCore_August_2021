package lessons.lesson31082021;

public class BlockInitializationExample {

    private int n;

    {
        n = 56;
        System.out.println("First non-static block");
        System.out.println(n);
    }

    {
        n = 67;
        System.out.println("Second non-static block");
        System.out.println(n);
    }

    {
        System.out.println("Third non-static block");
    }

    public BlockInitializationExample() {
        System.out.println("I am from constructor");
        System.out.println();
    }

    public static void main(String[] args) {
        new BlockInitializationExample();
        new BlockInitializationExample();
    }
}
