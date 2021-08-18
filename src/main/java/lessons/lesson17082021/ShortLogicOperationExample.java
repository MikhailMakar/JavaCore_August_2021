package lessons.lesson17082021;

public class ShortLogicOperationExample {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        if (b2 && b1) {
            System.out.println("Hey!");
        }
        if (b1 || b2) {
            System.out.println("Hey from ||");
        }
    }
}
