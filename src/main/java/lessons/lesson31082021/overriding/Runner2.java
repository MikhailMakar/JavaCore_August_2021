package lessons.lesson31082021.overriding;

public class Runner2 extends Runner {

    @Override
    public ChildClass getObject() {
        return new ChildClass();
    }
}
