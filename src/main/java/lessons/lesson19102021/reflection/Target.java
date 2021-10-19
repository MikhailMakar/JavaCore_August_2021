package lessons.lesson19102021.reflection;

import lessons.lesson8.annotation.MyAnnotation;

import java.util.Date;

@MyAnnotation
public class Target extends Date {
    private boolean flag;
    private static boolean staticFlag;
    private Target() {

    }

    private Target(boolean flag) {
        this.flag = flag;
    }

    public static boolean isStaticFlag() {
        return staticFlag;
    }

    private void method(boolean flag) {
        System.out.println("With primitive");
        if (flag) {
            System.out.println("flag is true");
        } else {
            System.out.println("flag is false");
        }
    }

    private void method(Boolean flag) {
        System.out.println("With wrapper");
        if (flag) {
            System.out.println("flag is true");
        } else {
            System.out.println("flag is false");
        }
    }

    public boolean getFlag(){
        return flag;
    }

    static Target getInstance() {
        return new Target();
    }
}
