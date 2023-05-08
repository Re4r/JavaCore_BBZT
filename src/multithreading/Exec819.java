package multithreading;

import java.util.concurrent.CountDownLatch;

public class Exec819 {
    private static CountDownLatch countDownLatch;

    static {
        countDownLatch = new CountDownLatch(3);
    }

    public static void main(String[] args) {

        new Friend(countDownLatch);
        new Friend(countDownLatch);
        new Friend(countDownLatch);
        new Friend(countDownLatch);
        new Friend(countDownLatch);

        marketStaffOnPlace();
        everythingIsReady();
        openMarket();

    }

    private static void marketStaffOnPlace() {
        try {
            Thread.sleep(2000);
            System.out.println("Market Staff came to work...");
            countDownLatch.countDown();
            System.out.println("CDL: " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void everythingIsReady() {
        try {
            Thread.sleep(3000);
            System.out.println("Everything is ready for openning...");
            countDownLatch.countDown();
            System.out.println("CDL: " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void openMarket() {
        try {
            Thread.sleep(4000);
            System.out.println("Market is openned...");
            countDownLatch.countDown();
            System.out.println("CDL: " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Friend extends Thread {
    private CountDownLatch countDownLatch;

    public Friend(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(Thread.currentThread().getName() + " starts to buy something...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
