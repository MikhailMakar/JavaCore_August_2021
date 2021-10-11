package lessons.lesson08102021.pubSub;

import java.util.Random;

public class Producer extends Thread {

    private MyBlockingQueue queue;
    private int count;

    public Producer(String name,MyBlockingQueue queue, int count) {
        super(name);
        this.queue = queue;
        this.count = count;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            queue.put(random.nextInt(2000));
        }

        queue.put(Integer.MAX_VALUE);
    }
}

