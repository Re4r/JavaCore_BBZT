package multithreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Exec825 {
    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(10);

        // Producer
        new Thread(() -> {
            while (true) {
                try {
                    arrayBlockingQueue.put(new Random().nextInt(100));
                    System.out.println(Thread.currentThread().getName() + " > put number");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        // Consumer
        new Thread(() -> {
            while (true) {
                Integer x = null;
                try {
                    x = arrayBlockingQueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " > took number: " + x);
            }
        }).start();




    }
}
