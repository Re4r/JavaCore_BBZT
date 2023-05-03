package multithreading;

public class Exec84 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Robo());
        Thread thread2 = new Thread(new Robo());
        Thread thread3 = new Thread(new Robo());

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Robo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
