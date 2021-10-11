package lessons.lesson08102021.philisophers;

public class Philosophers {

    public static void main(String[] args) {

        Object fork = new Object();
        Object knife = new Object();

        First first = new First(fork, knife);
        Second second = new Second(fork, knife);

        first.start();
        second.start();
    }
}

abstract class Philosopher extends Thread {

    protected Object fork;
    protected Object knife;

    public Philosopher(Object fork, Object knife) {
        this.fork = fork;
        this.knife = knife;
    }
}

class First extends Philosopher {

    public First(Object fork, Object knife) {
        super(fork, knife);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (fork) {
                synchronized (knife) {
                    System.out.println("First eating...");
                }
            }
        }
        System.out.println("Gooood");
    }
}

class Second extends Philosopher {

    public Second(Object fork, Object knife) {
        super(fork, knife);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (knife) {
                synchronized (fork) {
                    System.out.println("Second eating...");
                }
            }
        }
        System.out.println("Gooooooooooood");
    }
}
