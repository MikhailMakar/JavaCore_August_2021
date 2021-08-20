package lessons.lesson20082021;

public class StringPoolExample {

    private double data[];

    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "cat";
        String s3 = new String("cat").intern();
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
