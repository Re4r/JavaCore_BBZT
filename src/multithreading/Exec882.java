package multithreading;

public class Exec882 {
    static int counter;

    static void increment() {
        synchronized (Exec882.class) {
            counter++;
        }
    }

    public static void main(String[] args) {

        Repeater2 repeater2Thread1 = new Repeater2();
        Repeater2 repeater2Thread2 = new Repeater2();
        Repeater2 repeater2Thread3 = new Repeater2();
        Repeater2 repeater2Thread4 = new Repeater2();

        repeater2Thread1.start();
        repeater2Thread2.start();
        repeater2Thread3.start();
        repeater2Thread4.start();

        try {
            repeater2Thread1.join();
            repeater2Thread2.join();
            repeater2Thread3.join();
            repeater2Thread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Counter: " + counter);
    }

}

class Repeater2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            Exec882.increment();
            System.out.println(Thread.currentThread().getName() + " > " + Exec882.counter);
        }
    }
}
