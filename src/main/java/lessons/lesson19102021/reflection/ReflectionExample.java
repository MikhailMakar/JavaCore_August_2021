package lessons.lesson19102021.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExample {

    public static void main(String[] args) {
        try {
            Class<?> targetClass = Class.forName("lessons.lesson19102021.reflection.Target");
            Class<?> superclass = targetClass.getSuperclass();
            System.out.println(superclass);

            Annotation[] annotations = targetClass.getAnnotations();
            System.out.println(Arrays.toString(annotations));

            Constructor<?> declaredConstructor = targetClass.getDeclaredConstructor();
            Constructor<?> declaredConstructor1 = targetClass.getDeclaredConstructor(boolean.class);
            System.out.println(declaredConstructor);
            System.out.println(declaredConstructor1);

            declaredConstructor.setAccessible(true);

            Target targetInstance = (Target) declaredConstructor.newInstance();

            System.out.println(targetInstance instanceof Target);

            Method[] declaredMethods = targetClass.getDeclaredMethods();
            System.out.println(Arrays.toString(declaredMethods));

            Method method = targetClass.getDeclaredMethod("method", boolean.class);
            Method method1 = targetClass.getDeclaredMethod("method", Boolean.class);
            System.out.println(method);
            System.out.println(method1);

            method.setAccessible(true);
            method.invoke(targetInstance, true);
            System.out.println(targetInstance.getFlag());

            Field flag = targetClass.getDeclaredField("flag");
            Field staticFlag = targetClass.getDeclaredField("staticFlag");

            flag.setAccessible(true);
            staticFlag.setAccessible(true);
//
//            System.out.println(flag);
//            System.out.println(staticFlag);

            flag.setBoolean(targetInstance, true);
            System.out.println(targetInstance.getFlag());
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
