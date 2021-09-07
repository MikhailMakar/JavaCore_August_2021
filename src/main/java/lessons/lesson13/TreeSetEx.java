package lessons.lesson13;

import lessons.lesson8.classes.Human;

import java.util.LinkedHashMap;
import java.util.TreeSet;

public class TreeSetEx {


    public static void main(String[] args) {
        TreeSet<Human> humans = new TreeSet<>();

//        Human human = new Human("Antonio", 33);
//        humans.add(human);

        LinkedHashMap<String, String> stringMap = new LinkedHashMap<>(16, 0.75f, true);

        stringMap.put("1", "2");
        stringMap.put("2", "3");
        stringMap.put("3", "4");

        System.out.println(stringMap);

        stringMap.get("1");

        System.out.println(stringMap);


    }
}
