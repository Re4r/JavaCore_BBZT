package multithreading;

public class Exec86 {
    public static void main(String[] args) {

        System.out.println(new StringBuilder()
                .append(Thread.currentThread().getName())
                .append(" : ")
                .append(Thread.currentThread().getState())
                .append(" : START"));

        Counter counterThread = new Counter();

        counterThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Waking up...");

        counterThread.setB(false);

        try {
            counterThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(new StringBuilder()
                .append(Thread.currentThread().getName())
                .append(" : ")
                .append(Thread.currentThread().getState())
                .append(" : END"));

    }
}

class Counter extends Thread {
    private volatile boolean b = true;

    public boolean isB() {
        return b;
    }

    public Counter setB(boolean b) {
        this.b = b;
        return this;
    }

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop finished: counter = " + counter);
    }
}
