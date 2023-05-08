package multithreading;

import java.util.concurrent.CountDownLatch;

public class Exec819 {
    static CountDownLatch countDownLatch;

    static {
        countDownLatch = new CountDownLatch(3);
    }

    public static void main(String[] args) {

    }

    private static void marketStaffOnPlace() {
        try {
            Thread.sleep(2000);
            System.out.println("Market Staff came to work...");
            countDownLatch.countDown();
            System.out.println("cdl: " + countDownLatch);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
