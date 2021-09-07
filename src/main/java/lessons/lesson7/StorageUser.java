package lessons.lesson7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StorageUser {

  public static void main(String[] args) {
    NotGenericStorage notGenericStorage = new NotGenericStorage("String");
    notGenericStorage.add(1);
    notGenericStorage.add(new Date());
    NotGenericStorage notGenericStorage2 = new NotGenericStorage(2);
    final NotGenericStorage notGenericStorage1 = new NotGenericStorage(new Date());

    final Object value = notGenericStorage.getValue();

    if (value instanceof String) {
      System.out.println(((String) value).toUpperCase());
    }

//    GenericStorage<String> stringGenericStorage = new GenericStorage<>("String");
//    System.out.println(stringGenericStorage.value);
//    GenericStorage<String> stringGenericStorage1 = new GenericStorage<>(2); //ERROR

    List<String> strings = new ArrayList<>();
    final ArrayList<Object> objects = new ArrayList<>();

    List<?> list = new ArrayList<>(); //raw type
//    final Object o = list.get(0);
    list.add(null);
    GenericStorage<NotGenericStorage> notGenericStorageGenericStorage;

    GenericStorage<Integer> integerGenericStorage = new GenericStorage<>(10);

    GenericStorage<Long> genericStorage = new GenericStorage<>( 10L);

    Integer integer = 10;
    Long l = 10l;
    System.out.println(l.equals(integer));
    System.out.println(integerGenericStorage.compare(genericStorage));
  }
}
