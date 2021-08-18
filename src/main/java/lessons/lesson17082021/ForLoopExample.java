package lessons.lesson17082021;

import java.util.ArrayList;
import java.util.List;

public class ForLoopExample {
    public static void main(String[] args) {

        Outer:
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            Inner:
            if (i == 6) {
                break Outer;
            }
        }

        System.out.println();

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");

        for (String str : list) {
            System.out.println(str);
        }
    }
}
