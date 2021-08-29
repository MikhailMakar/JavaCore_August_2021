package lessons.lesson27082021;

public class MultiDimensionalExample {

    public static void main(String[] args) {
        int multiArray[][] = new int[3][];
        multiArray[0] = new int[18];
        multiArray[1] = new int[23];
        multiArray[2] = new int[2];

        for (int i = 0; i < multiArray.length; i++) {
            System.out.println(multiArray[i].length);
        }

        int arr[][] = {
                {1, 2},
                {2, 5, 5}
        };

        Object objectsArray[][] = new Object[2][];
        objectsArray[0] = new String[4];
    }
}
