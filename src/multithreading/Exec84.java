package multithreading;

public class Exec84 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Robo());
        Thread thread2 = new Thread(new Robo());
        Thread thread3 = new Thread(new Robo());

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(new StringBuilder()
                .append(Thread.currentThread().getName())
                .append(" : ")
                .append(Thread.currentThread().getPriority())
                .append(" Done...")
                .toString());
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
