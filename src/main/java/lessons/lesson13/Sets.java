package lessons.lesson13;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {


    public static void main(String[] args) {

        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(17);
        integerSet.add(1);
        boolean add = integerSet.add(1);
        integerSet.add(18);
        integerSet.add(4);
        integerSet.add(2);

        System.out.println(integerSet);
        System.out.println(add);

        NavigableSet<Integer> integers = new TreeSet<>();

        integers.add(4);
        integers.add(10);
        integers.add(1);
        integers.add(3);
        integers.add(-1);

        System.out.println(integers);
        NavigableSet<Integer> integers1 = integers.descendingSet();

        System.out.println(integers1);

        NavigableSet<Integer> integers2 = integers.headSet(3, true);

        System.out.println(integers2);
        System.out.println("Min is: " + integers.first() + "; Max is: " + integers.last());

        integers.pollFirst();
        System.out.println(integers);
    }
}
