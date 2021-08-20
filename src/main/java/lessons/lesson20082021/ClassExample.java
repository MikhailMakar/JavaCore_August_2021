package lessons.lesson20082021;

import java.util.ArrayList;
import java.util.List;

public class ClassExample extends BasicClassExample implements InterfaceExample, InterfaceAnotherExample {

    private int number;

    private static final List<String> list = new ArrayList<>();

    public ClassExample() {
    }

    public ClassExample(int number) {
        this.number = number;
    }

    @Override
    public void someMethod() {
        InterfaceAnotherExample.super.someMethod();
    }
}
