package lessons.lesson08102021.staticSynchronized;

import lombok.SneakyThrows;

public class StaticSynch{

    @SneakyThrows
    public static void a() {
        synchronized (StaticSynch.class) {
            System.out.println("Line #1 in the method a");
            Thread.sleep(5000);
            System.out.println("Line #2 in the method a");
        }
    }

    @SneakyThrows
    public static synchronized void b() {
        System.out.println("Line #1 in the method b");
        Thread.sleep(5000);
        System.out.println("Line #2 in the method b");
    }
}

class Main {
    public static void main(String[] args) {
        StaticSynch.a();
        StaticSynch.b();
    }
}

