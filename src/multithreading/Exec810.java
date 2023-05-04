package multithreading;

public class Exec810 {
    public static final Object LOCK1 = new Object();
    public static final Object LOCK2 = new Object();
    public static void main(String[] args) {


    }
}

class Thex extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Trying to cath monitor of object LOCK1...");
        synchronized (Exec810.LOCK1) {
            System.out.println(Thread.currentThread().getName() + " Monitor of object LOCK1 - Catched!");
            System.out.println(Thread.currentThread().getName() + " Trying to cath monitor of object LOCK2...");
            synchronized (Exec810.LOCK2) {
                System.out.println(Thread.currentThread().getName() + " Monitor of object LOCK1 - Catched! "
                        + "Monitor of object LOCK2 - Catched!");
            }
        }
    }
}

class ThexOne extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Trying to cath monitor of object LOCK1...");
        synchronized (Exec810.LOCK1) {
            System.out.println(Thread.currentThread().getName() + " Monitor of object LOCK1 - Catched!");
            System.out.println(Thread.currentThread().getName() + " Trying to cath monitor of object LOCK2...");
            synchronized (Exec810.LOCK2) {
                System.out.println(Thread.currentThread().getName() + " Monitor of object LOCK1 - Catched! "
                        + "Monitor of object LOCK2 - Catched!");
            }
        }
    }
}
