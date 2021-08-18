package lessons.lesson17082021;

public class WhileLoopExample {

    public static void main(String[] args) {
        int i = 1;
        while (true) {
            System.out.println("Please, stop me!");
            i++;
            if (i > 10) {
                break;
            }
        }
    }
}
