package lessons.lesson17082021;

public class WrapperExample {
    public static void main(String[] args) {
        Integer someInteger = 12;
        Integer someInteger2 = 12;
        System.out.println(someInteger == someInteger2);
        Integer integer = new Integer(23);
        Integer integer2 = new Integer(23);
        System.out.println(integer == integer2);
        Integer otherInteger = Integer.valueOf(1123);
        Integer otherInteger2 = Integer.valueOf(1123);
        System.out.println(otherInteger2 == otherInteger);

        Long long1 = 23L;
        Long long2 = 23L;
        System.out.println(long1 == long2);

        Double double1 = new Double(3.5);

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("True");
        Boolean b3 = new Boolean("TrUe");
        Boolean b4 = new Boolean("fdgrsevrsevser");
    }
}
