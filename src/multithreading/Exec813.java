package multithreading;

public class Exec813 {
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
