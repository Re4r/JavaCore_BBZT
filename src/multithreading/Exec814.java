package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exec814 {


    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " Starts...");

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorServiceSingle = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            executorService.execute(new Fox());
//            executorServiceSingle.execute(new Fox());
        }

        executorService.shutdown();
//        executorServiceSingle.shutdown();

//        try {
//            executorService.awaitTermination(5, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println(Thread.currentThread().getName() + " Ends");
    }
}

class Fox implements Runnable {

    static int counter;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " > starts work...");

        for (int i = 0; i < 3; i++) {
            counter++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(Thread.currentThread().getName() + " > ends work..." + " counter = " + counter);
    }
}
