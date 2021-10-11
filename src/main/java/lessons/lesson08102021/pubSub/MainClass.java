package lessons.lesson08102021.pubSub;

public class MainClass {

    public static void main(String[] args) {

        MyBlockingQueue queue = new MyBlockingQueue(10);

        Producer producerOne = new Producer("Prod one", queue, 10000);
        Producer producerOTwo = new Producer("Prod two", queue, 10000);

        Consumer consumerOne = new Consumer("Cons one", queue);
        Consumer consumerTwo = new Consumer("Cons two", queue);

        producerOne.start();
        producerOTwo.start();

        consumerOne.start();
        consumerTwo.start();

        try {
            producerOne.join();
            producerOTwo.join();
            consumerOne.join();
            consumerTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Consumer one: " + consumerOne.getWareHouse().size());
        System.out.println("Consumer two: " + consumerTwo.getWareHouse().size());
    }
}

