package lessons.lesson17082021;

public class ConstantExample {

    public static final int CONSTANT_VALUE;

    static {
        CONSTANT_VALUE = 6;
    }

    public static void main(String[] args) {
        System.out.println(CONSTANT_VALUE);
    }
}
