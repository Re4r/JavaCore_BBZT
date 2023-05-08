package multithreading;

import java.util.concurrent.Semaphore;

public class Exec818 {
    public static void main(String[] args) {

        Semaphore phoneBox = new Semaphore(2);

    }
}

class Person extends Thread {
    private Semaphore phoneBox;

    public Person(Semaphore phoneBox) {
        this.phoneBox = phoneBox;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " Waiting...");
            phoneBox.acquire();
            System.out.println(Thread.currentThread().getName() + " Using device...");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Finished...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            phoneBox.release();
        }
    }
}