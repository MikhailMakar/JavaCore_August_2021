package lessons.lesson28092021;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(18);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(23);
        priorityQueue.add(45);
        priorityQueue.add(0);

        System.out.println(priorityQueue);
    }
}
