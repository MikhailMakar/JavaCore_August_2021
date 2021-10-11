package lessons.lesson08102021.pubSub;

import java.util.ArrayList;
import java.util.List;

public class Consumer extends Thread {
    private MyBlockingQueue queue;
    private List<Integer> wareHouse = new ArrayList<>();
    public Consumer(String name,MyBlockingQueue queue) {
        super(name);
        this.queue = queue;
    }
    @Override
    public void run() {
        Integer take ;
        while ((take = queue.take())!= Integer.MAX_VALUE) {
            wareHouse.add(take);
        }
    }
    public List<Integer> getWareHouse() {
        return wareHouse;
    }
}

