package lessons.lesson31082021.inheritance;

public class ParentInitializer {

    static {
        System.out.println("Static block of parent");
    }

    {
        System.out.println("Non-static block of parent");
    }

    public ParentInitializer() {
        System.out.println("Parent constructor");
    }
}
