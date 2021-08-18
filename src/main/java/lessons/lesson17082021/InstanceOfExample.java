package lessons.lesson17082021;

public class InstanceOfExample {
    public static void main(String[] args) {
        IntegerExample integerExample = new IntegerExample();
        if (integerExample instanceof IntegerExample) {
            System.out.println("true");
        }
    }
}
