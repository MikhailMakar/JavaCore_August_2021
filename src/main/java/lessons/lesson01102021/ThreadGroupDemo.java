package lessons.lesson01102021;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");
        MyThread ob1 = new MyThread("One", groupA);
        MyThread ob2 = new MyThread("Two", groupA);
        MyThread ob3 = new MyThread("Three", groupB);
        MyThread ob4 = new MyThread("Four", groupB);

        groupA.list();
        groupB.list();

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        groupA.interrupt();
    }
}

class MyThread extends Thread {
    public MyThread(String threadName, ThreadGroup tgOb) {
        super(tgOb, threadName);
        System.out.println("New thread: " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception in " + getName());
        }
        System.out.println(getName() + " exiting.");
    }
}

