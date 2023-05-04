package multithreading;

public class Exec813 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " > STARTS");

        InterruptedThread thread = new InterruptedThread();
        thread.start();
        try {
            Thread.sleep(5000);
            thread.interrupt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + " > ENDS");
    }
}

class InterruptedThread extends Thread {
    private static double sqrtSum;

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            sqrtSum += Math.sqrt(i);
        }
        System.out.println(sqrtSum);
    }
}
