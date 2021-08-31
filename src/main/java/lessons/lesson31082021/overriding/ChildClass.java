package lessons.lesson31082021.overriding;

public class ChildClass extends ParentClass {

    @Override
    public void doSomething() {
//        super.doSomething();
        System.out.println("Child class");
    }

    @Override
    public Integer getSomeNumber(Integer integer) {
        return integer;
    }

    public static void main(String[] args) {
//        new ChildClass().doSomething();
//        Integer someNumber = new ChildClass().getSomeNumber(6);
//        System.out.println(someNumber);
        ParentClass parentClass = new ChildClass();
        parentClass.doSomething();
        parentClass = new ParentClass();
        parentClass.doSomething();
    }
}
