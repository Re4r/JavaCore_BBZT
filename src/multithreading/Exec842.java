package multithreading;

public class Exec842 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " - START");

        Thread thread1 = new Thread(new Worker());
        Thread thread2 = new Thread(new Worker());
        Thread thread3 = new Thread(new Worker());

        System.out.println(thread1.getState() + " : " + thread1.getName());
        System.out.println(thread2.getState() + " : " + thread2.getName());
        System.out.println(thread3.getState() + " : " + thread3.getName());

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println(thread1.getState() + " : " + thread1.getName());
        System.out.println(thread2.getState() + " : " + thread2.getName());
        System.out.println(thread3.getState() + " : " + thread3.getName());

        try {
            thread1.join();
            thread2.join();
            thread3.join();

            System.out.println(thread1.getState() + " : " + thread1.getName());
            System.out.println(thread2.getState() + " : " + thread2.getName());
            System.out.println(thread3.getState() + " : " + thread3.getName());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + " - END");

    }
}

class Worker implements Runnable {
    @Override
    public void run() {
        System.out.println("Work Begins: " + Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work Ends: " + Thread.currentThread().getName());
    }
}
