package lessons.lesson28092021;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);

        System.out.println(queue.element());

        System.out.println(queue.offer(4));
        System.out.println(queue);

        System.out.println(queue.peek());
    }
}
