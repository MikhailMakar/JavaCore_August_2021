package lessons.lesson01102021;

public class ThreadUncaughtExceptionDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new SimpleThread());
        t.setUncaughtExceptionHandler(
                new Thread.UncaughtExceptionHandler() {
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println(t + " throws exception: " + e);
                    }
                });
        t.start();
    }
}

class SimpleThread implements Runnable {
    public void run() {
        throw new RuntimeException("It is a greater exception.");
    }
}

