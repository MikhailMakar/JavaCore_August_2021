package lessons.lesson08102021;

import java.util.concurrent.*;

public class SimpleThread implements Runnable {
    public int count = 0;

    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            count++;
        }
        System.out.println(count);
    }
}

class Solution {
    public static void main(String[] args) throws Exception {
        ExecutorService ex = Executors.newSingleThreadScheduledExecutor();
//        ex.execute(new SimpleThread());
//        ex.execute(new SimpleThread());
////        ex.shutdown();
//        ex.submit(new SimpleThread());
//        ex.submit(new CallableExample());
////        ex.execute(new CallableExample());

        Future<CallableExample> submit = ex.submit(new CallableExample());
        System.out.println(submit.isDone());
        CallableExample callableExample = submit.get();
        callableExample.call();
    }

}

class CallableExample implements Callable<CallableExample> {
    @Override
    public CallableExample call() throws Exception {
        System.out.println("I am callable child");
        return new CallableExample();
    }
}

