package lessons.lesson12.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {

  public static void main(String[] args) {

    Map<String, String> stringMap = new Hashtable<>();

    stringMap.put("key1", "value1");
    stringMap.put("key1", "value2");
    stringMap.put("key1", "value3");

    System.out.println(stringMap);


    //How to loose element in map
    Map<Key, String> mutableKey = new HashMap<>();

    Key key = new Key();
    key.setI(10);

    mutableKey.put(key, "some value");

    System.out.println(mutableKey.get(key));

  }
}
