package lessons.lesson12102021;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo implements Runnable {

    public static int count;
    private static Lock lock = new ReentrantLock();

    @SneakyThrows
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (lock.tryLock()) {
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.println("Gotcha:" + Thread.currentThread().getName());
                System.out.println(count++);
                lock.unlock();
            } else {
                System.out.println("Failed");
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        LockDemo lock1 = new LockDemo();
        LockDemo lock2 = new LockDemo();
        Thread th1 = new Thread(lock1);
        Thread th2 = new Thread(lock2);

        th1.start();
        th2.start();
    }
}
