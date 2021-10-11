package lessons.lesson08102021.pubSub;

import lombok.SneakyThrows;

import java.util.LinkedList;
import java.util.Queue;

public class MyBlockingQueue {

    private Queue<Integer> innerQueue = new LinkedList<>();
    private int capacity;

    public MyBlockingQueue(int capacity) {
        this.capacity = capacity;
    }

    @SneakyThrows
    public synchronized void put(int value) {
        while (innerQueue.size() >= capacity){
            System.out.println(Thread.currentThread().getName() + ": queue is full");
            wait();
            System.out.println(Thread.currentThread() + ": free space in queue");
        }
        innerQueue.offer(value);
        notifyAll();
    }

    @SneakyThrows
    public synchronized Integer take() {
        while (innerQueue.isEmpty()){
            System.out.println(Thread.currentThread().getName() + ": queue is empty");
            wait();
            System.out.println(Thread.currentThread().getName() + ": new element in queue");
        }
        Integer poll = innerQueue.poll();
        notifyAll();
        return poll;
    }

}

