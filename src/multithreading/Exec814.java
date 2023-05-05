package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exec814 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
    }
}

class Fox implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " > active...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
