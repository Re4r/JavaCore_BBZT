package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exec8152 {
    public static void main(String[] args) {

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        test(cachedThreadPool);

    }

    static synchronized void test(ExecutorService executorService) {

        for (int i = 0; i < 100; i++) {

            executorService.execute(new WhiteBox());
        }

        executorService.shutdown();
    }
}

class WhiteBox implements Runnable {

    private static int counter;

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " > starts work...");

        for (int i = 0; i < 50; i++) {
            counter++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(Thread.currentThread().getName() + " > ends work..." + " counter = " + counter);
    }
}
