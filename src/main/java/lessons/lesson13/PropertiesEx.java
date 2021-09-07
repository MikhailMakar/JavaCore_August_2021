package lessons.lesson13;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesEx {
    public static void main(String[] args) {

        Properties properties = new Properties();

        properties.put("Kolya", "nikolas@gmail.com");
        properties.put("Anton", "toha@yahoo.com");
        properties.put("Andrei", "dron@mail.ru");

        Set<Object> objects = properties.keySet();

        System.out.println(objects);

        Iterator<Object> iterator = objects.iterator();

        while (iterator.hasNext()) {
            String next = (String) iterator.next();
            System.out.println(next + " email: " + properties.getProperty(next));
            Object o = properties.get(next);
            System.out.println(o);
        }

    }
}