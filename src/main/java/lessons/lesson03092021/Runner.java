package lessons.lesson03092021;

public class Runner {

    public static void main(String[] args) {
        AbstractParentClassExample abstractClass1 = new ChildOne();
        AbstractParentClassExample abstractClass2 = new ChildTwo();
        AbstractParentClassExample abstractClass3 = new ChildThree();
        abstractClass1.doSomething();
        abstractClass2.doSomething();
        abstractClass3.doSomething();
        abstractClass1.print();
        abstractClass2.print();
        abstractClass3.print();

        AbstractParentClassExample abstractParentClassExample = new AbstractParentClassExample() {
            @Override
            public void doSomething() {

            }
        };
    }
}
