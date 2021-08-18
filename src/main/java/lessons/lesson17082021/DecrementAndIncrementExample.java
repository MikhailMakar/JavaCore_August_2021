package lessons.lesson17082021;

public class DecrementAndIncrementExample {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Increment examples");
        System.out.println(i++);//postfix increment
        System.out.println(i);
        System.out.println(++i);//prefix increment

        System.out.println();

        System.out.println("Decrement examples");
        int j =  4;
        System.out.println(j--);
        System.out.println(j);
        System.out.println(--j);
    }
}
