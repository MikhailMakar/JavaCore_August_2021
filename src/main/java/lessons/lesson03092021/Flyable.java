package lessons.lesson03092021;

public interface Flyable extends InterfaceOne, InterfaceTwo {

    String INTERFACE_NAME = "I am interface";

    void fly();

    default void printDescription() {
        System.out.println("I am still working");
        System.out.println(Flyable.getInterfaceName());
    }

    static String getInterfaceName() {
        return "I am static method in interface";
    }
}
