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
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Mobile call ends...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            LOCK.unlock();
        }

    }

    void skypeCall() {
        LOCK.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Skype call starts...");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " Skype call ends...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            LOCK.unlock();
        }

    }

    void whatsupCall() {
        LOCK.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " WhatsUp call starts...");
            Thread.sleep(6000);
            System.out.println(Thread.currentThread().getName() + " WhatsUp call ends...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            LOCK.unlock();
        }

    }


}