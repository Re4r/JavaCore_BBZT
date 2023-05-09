package multithreading;

public class Exec821 {
    private static int counter;

    static void increment() {
        counter++;
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Run2());
        Thread thread2 = new Thread(new Run2());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter);

    }
}

class Run2 implements Runnable {
    @Override
    public void run() {
        Exec821.increment();
    }
}