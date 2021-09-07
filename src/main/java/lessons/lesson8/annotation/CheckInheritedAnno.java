package lessons.lesson8.annotation;

import java.lang.annotation.Annotation;

public class CheckInheritedAnno {

//  @SneakyThrows
  public static void main(String[] args) throws ClassNotFoundException {

    final Class<?> parentClass = Class.forName("lesson2021_02_25.annotation.ParentClass");

    final Annotation[] annotations = parentClass.getAnnotations();
    for (Annotation annotation : annotations) {
      System.out.println(annotation.toString());
    }

    final Class<?> childClass = Class.forName("lesson2021_02_25.annotation.ChildClass");

    final Annotation[] annotations1 = childClass.getAnnotations();
    for (Annotation annotation : annotations1) {
      System.out.println(annotation.toString());
    }
  }
}
