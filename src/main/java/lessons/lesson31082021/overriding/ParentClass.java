package lessons.lesson31082021.overriding;

import java.io.IOException;

public class ParentClass {

    protected void doSomething() {
        System.out.println("Parent method doSomething");
    }

    protected Number getSomeNumber(Integer integer) {
        return integer;
    }
}
