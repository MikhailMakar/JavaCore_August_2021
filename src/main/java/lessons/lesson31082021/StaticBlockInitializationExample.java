package lessons.lesson31082021;

public class StaticBlockInitializationExample {

    private static int n;

    static {
        n = 45;
        System.out.println("I am from static block and n = " + n);
    }

    {
        System.out.println("I'm from non-static block 1" + n++);
    }

    {
        System.out.println("I'm from non-static block 2" + n++);
    }

    public static void main(String[] args) {
        new StaticBlockInitializationExample();
        new StaticBlockInitializationExample();
    }
}
