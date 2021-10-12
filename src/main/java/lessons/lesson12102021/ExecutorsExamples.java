package lessons.lesson12102021;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsExamples {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> System.out.println(Thread.currentThread().getName());

        ExecutorService single = Executors.newSingleThreadExecutor();
        ExecutorService fixed = Executors.newFixedThreadPool(5);
        ExecutorService cached = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
//            single.submit(runnable);
//            fixed.submit(runnable);
//            cached.submit(runnable);
        }

        single.shutdown();
        fixed.shutdown();
        cached.shutdown();

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);

        scheduledExecutorService.scheduleAtFixedRate(runnable, 1, 2, TimeUnit.SECONDS);

        TimeUnit.SECONDS.sleep(4);
    }
}
