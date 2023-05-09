package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Exec821 {

//    private static int counter;
    private static AtomicInteger counter = new AtomicInteger();

    public static AtomicInteger getCounter() {
        return counter;
    }

    static void increment() {
        counter.incrementAndGet();
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Run2());
        Thread thread2 = new Thread(new Run2());
        Thread thread3 = new Thread(new Run2());

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Counter = " + counter);

    }
}

class Run2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " > starts work...");
        for (int i = 0; i < 1_000_000; i++) {
            Exec821.increment();
        }
        System.out.println(new StringBuilder()
                .append(Thread.currentThread().getName())
                .append(" : ")
                .append(Exec821.getCounter())
                .append(" > ends work"));
    }
}