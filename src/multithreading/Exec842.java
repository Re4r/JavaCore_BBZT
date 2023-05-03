package multithreading;

public class Exec842 {
    public static void main(String[] args) {

    }
}

class Worker implements Runnable {
    @Override
    public void run() {
        System.out.println("Work Begins: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work Ends: " + Thread.currentThread().getName());
    }
}
