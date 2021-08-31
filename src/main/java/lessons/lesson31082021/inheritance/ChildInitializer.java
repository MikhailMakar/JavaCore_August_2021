package lessons.lesson31082021.inheritance;

public class ChildInitializer extends ParentInitializer {

    static {
        System.out.println("Static block of child");
    }

    {
        System.out.println("Non-static block of child");
    }

    public ChildInitializer() {
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        new ChildInitializer();
        new ParentInitializer();
        new ChildInitializer();
    }
}
