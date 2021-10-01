package lessons.lesson01102021;

public class DaemonInspector {
    public static void main(String[] args) {
        System.out.println("Start main thread.");
        DaemonThread daemon = new DaemonThread();
        daemon.setDaemon(true);
        daemon.start();

        try {
            Thread.sleep(8_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End main thread.");
    }
}

class DaemonThread extends Thread{
    public void run(){
        for(int i=0;i<10; i++){
            System.out.print(i + " ");
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}