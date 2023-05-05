package multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Exec815 {
    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);

//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.schedule(new BlackFox(), 5, TimeUnit.SECONDS);
//        }

//        scheduledExecutorService.scheduleAtFixedRate(new BlackFox(), 1, 1, TimeUnit.SECONDS);
//        scheduledExecutorService.scheduleWithFixedDelay(new BlackFox(), 1, 3, TimeUnit.SECONDS);

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        scheduledExecutorService.shutdown();

    }
}

class BlackFox implements Runnable {

    private static int counter;

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " > starts work...");

        for (int i = 0; i < 3; i++) {
            counter++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(Thread.currentThread().getName() + " > ends work..." + " counter = " + counter);
    }
}
