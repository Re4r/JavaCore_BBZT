package multithreading;

import java.sql.SQLOutput;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Exec811 {
    public static void main(String[] args) {

    }
}

final class Caller {
    private static final Lock LOCK = new ReentrantLock();

    void mobileCall() {
        LOCK.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Mobile call starts...");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " Mobile call ends...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            LOCK.unlock();
        }

    }


}