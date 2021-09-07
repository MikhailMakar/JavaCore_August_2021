package lessons.lesson8.classes;

import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class AnonClass {

  @SneakyThrows
//  @SuppressWarnings("all")
  public static void main(String[] args) {

    Date date = new Date() {
      @Override
      public long getTime() {
        return super.getTime();
      }
    };

    Date date2 = new Date() {

      @Override
      public long getTime() {
        return super.getTime();
      }
    };

    final Class<? extends Date> aClass = date2.getClass();

    final Constructor<? extends Date> declaredConstructor = aClass.getDeclaredConstructor();

    declaredConstructor.setAccessible(true);
    final Date date1 = declaredConstructor.newInstance();
    System.out.println(date2.getClass().getName());
    System.out.println(date1.getClass().getName());

    final Human human = new Human("Harry", 12) {
      //      {
//        setAge(13);
//        setName("Another");
//      }
      {
        Human human1 = new Human("Des", 35){
        };
      }

      public void printInOtherWay() {
        System.out.println(getAge() + getName());
      }
    };
    human.printHuman();
//    human.printInOtherWay(); //ERROR
    System.out.println(human.getAge());
    System.out.println(human.getName());



    Human[] humans = {new Human("Vasya", 11),
        new Human("Kolya", 24),
        new Human("unknown", 11)};

    Arrays.sort(humans,
        new Comparator<Human>() {
          @Override
          public int compare(Human o1, Human o2) {
            return 0;
          }
        });
  }




}

class HumanComparator implements Comparator<Human> {


  @Override
  public int compare(Human o1, Human o2) {
    return 0;
  }
}