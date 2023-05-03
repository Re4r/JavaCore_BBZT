package multithreading;

public class Exec872 {
    static int counter;

    public static void main(String[] args) {
        Repeater repeaterThread1 = new Repeater();
        Repeater repeaterThread2 = new Repeater();
        Repeater repeaterThread3 = new Repeater();

        repeaterThread1.start();
        repeaterThread2.start();
        repeaterThread3.start();

        try {
            repeaterThread1.join();
            repeaterThread2.join();
            repeaterThread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Counter: " + counter);
    }


}

class Repeater extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Exec872.counter++;
            System.out.println(Thread.currentThread().getName() + " > " + Exec872.counter);
        }
    }
}
