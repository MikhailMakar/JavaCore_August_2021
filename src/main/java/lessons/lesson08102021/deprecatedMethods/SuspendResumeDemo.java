package lessons.lesson08102021.deprecatedMethods;

import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class SuspendResumeDemo {

    @SneakyThrows
    public static void main(String[] args)  {
        ConsoleClock clock = new ConsoleClock();
        clock.start();
        Thread.sleep(3000);
        clock.suspend();
        Thread.sleep(3000);
        clock.resume();
    }
}

class ConsoleClock extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + time());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private String time() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("hh/mm/ss");
        return s.format(d);
    }
}


