package lessons.lesson8.annotation;

import lombok.Data;
import lombok.SneakyThrows;

import java.lang.annotation.Annotation;

@Data
public class ReflectionAnno {

  private int value;

  @SneakyThrows
  @SuppressWarnings("deprecation")
  public static void main(String[] args) {
    Class<?> aClass = Class.forName("lesson2021_02_25.annotation.AnnotationUser");

    Annotation[] annotations = aClass.getAnnotations();

    for (Annotation annotation : annotations) {
      System.out.println(annotation);
    }

    final Integer integer = new Integer(1);
  }

}
