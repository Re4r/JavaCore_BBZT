package multithreading;

public class Exec872 {
    static int counter;

    static synchronized void increment() {
        counter++;
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

class Repeater extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Exec872.increment();
            System.out.println(Thread.currentThread().getName() + " > " + Exec872.counter);
        }
    }
}
