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
                    Integer x = new Random().nextInt(100);
                    arrayBlockingQueue.put(x);
                    System.out.println(Thread.currentThread().getName() + " > put number: " + x + " : " + arrayBlockingQueue);
                    System.out.println("------------------------------------------------");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        // Consumer
        new Thread(() -> {
            while (true) {
                try {
                    Integer x = arrayBlockingQueue.take();
                    System.out.println(Thread.currentThread().getName() + " > took number: " + x + " : " + arrayBlockingQueue);
                    System.out.println("------------------------------------------------");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();




    }
}
