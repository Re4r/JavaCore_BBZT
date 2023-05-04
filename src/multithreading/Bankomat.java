package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) {

        Lock lock = new ReentrantLock();

        new Employee(lock);
        new Employee(lock);
        new Employee(lock);
        new Employee(lock);
        new Employee(lock);
    }
}

final class Employee extends Thread {
    private Lock lock;

    public Employee(Lock lock) {
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " > Waiting for operation...");

//        lock.lock();
        if (lock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + " > Start using device...");

            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " > Completed operation");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " > Going away...");
        }
    }
}
