package multithreading;

public class Exec815 {
}

class BlackFox implements Runnable {

    private static int counter;

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " > starts work...");

        for (int i = 0; i < 3; i++) {
            counter++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(Thread.currentThread().getName() + " > ends work..." + " counter = " + counter);
    }
}
