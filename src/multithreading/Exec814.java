package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exec814 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " Starts");
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            executorService.execute(new Fox());
        }

        System.out.println(Thread.currentThread().getName() + " Ends");
    }
}

class Fox implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " > in progress...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
