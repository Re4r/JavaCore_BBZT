package multithreading;

public class Exec87 {
    public static void main(String[] args) {

        Run run = new Run();

        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        Thread thread3 = new Thread(run);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Count {
    static int count = 0;
}

class Run implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Count.count++;
            System.out.printf("%s : %d%n", Thread.currentThread().getName(), Count.count);
        }
    }
}
