package multithreading;

import java.util.stream.IntStream;

public class Exec813 {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " > STARTS");

        InterruptedThread thread = new InterruptedThread();

        thread.start();

        try {
            Thread.sleep(2000);
            thread.interrupt();
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + " > ENDS");
    }
}

class InterruptedThread extends Thread {
    private static double sqrtSum;

    @Override
    public void run() {
        for (int i = 0; i < 1000000000; i++) {
            if (isInterrupted()) {
                System.out.println(Thread.currentThread().getName() + " > Interrupted");
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(Thread.currentThread().getName() + " > Interrupted during sleep");
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
