package lessons.lesson27082021;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        int[] integers = new int[10];
        int integers2[] = new int[]{1, 2};
        int[] integers3 = {1, 3, 5, 7, 67};
        System.out.println(integers3[3]);

        System.out.println();

        for (int i = 0; i < integers3.length; i++) {
            System.out.println(integers3[i]);
        }
        for (Integer i : integers3) {
            System.out.println(i);
        }

        Object[] objectStrings = new String[2];
//        objectStrings[0] = new Object();
        objectStrings[1] = new String("");
        String objectString = (String) objectStrings[1];
        System.out.println(objectString.getBytes(StandardCharsets.UTF_8));
        String[] array = getArray(1);
        System.out.println();
        array = getArray(-2);
        System.out.println(Arrays.stream(array).toArray());
    }

    /**
     * This method does nothing
     * @param n
     */
    private void doNothing(int n) {
        if (n < 0) {
            throw new RuntimeException("n should be greater than 0");
        }
        int a = n * 45;
        int b = a * 9;
        System.out.println("No actions!" + b);
    }

    private static String[] getArray(int n) {
        if (n > 0) {
            return new String[10];
        } else return new String[0];
    }
}
