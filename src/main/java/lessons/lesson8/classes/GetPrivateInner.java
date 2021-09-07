package lessons.lesson8.classes;

import lombok.SneakyThrows;

import java.lang.reflect.Constructor;


public class GetPrivateInner {

  @SneakyThrows
  public static void main(String[] args) {

    final Class<?> wrapper = Class.forName("lesson2021_02_25.classes.Wrapper");
    final Constructor<?> constructor = wrapper.getConstructor();

    final Object o = constructor.newInstance();

    final Class<?>[] classes = wrapper.getDeclaredClasses();
    final Class<?> privateInner = classes[0];

    final Constructor<?> constructor1 = privateInner.getDeclaredConstructor(wrapper);
    constructor1.setAccessible(true);

    final Object o1 = constructor1.newInstance(o);
    System.out.println(o1);
  }
}
