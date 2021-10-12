package lessons.lesson12102021;

import java.util.concurrent.*;

public class CallableExample {

    public static void main(String[] args) throws InterruptedException {

        Callable<String> callable = () -> {
            System.out.println("Inside of Callable...");
//            TimeUnit.SECONDS.sleep(2);
            String hello = "Hello, ";
            String world = "world!";
            return hello + world;
        };

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        Future<String> submit = singleThreadExecutor.submit(callable);

        System.out.println("Execution from main thread...");

//        TimeUnit.SECONDS.sleep(5);

        try {
            if (submit.isDone()) {
                System.out.println(submit.get());
            } else {
                System.out.println("In progress");
                submit.cancel(true);
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        singleThreadExecutor.shutdown();
    }
}
