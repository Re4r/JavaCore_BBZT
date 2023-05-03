package multithreading;

public class Exec88 {
    public static void main(String[] args) {

        Sync sync = new Sync();

        Thread thread1 = new Thread(sync);
        Thread thread2 = new Thread(sync);
        Thread thread3 = new Thread(sync);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Counter2 {
    static int counter;

}

class Sync implements Runnable {

    private void doSmthg() {
        System.out.println("not synchronized " + Thread.currentThread().getName());
    }

    private void doWork() {
        doSmthg();
        synchronized (this) {
            Counter2.counter++;
            System.out.println(Counter2.counter);
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            doWork();
        }
    }
}