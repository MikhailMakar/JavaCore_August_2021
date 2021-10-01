package lessons.lesson01102021;

public class Walk implements Runnable {
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Walking");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}

