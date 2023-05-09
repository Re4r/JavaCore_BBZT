package multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exec822 {
    public static void main(String[] args) {

        ArrayList<Integer> source = new ArrayList<>();

        ArrayList<Integer> target = new ArrayList<>();

        List<Integer> syncList = Collections.synchronizedList(target);

        for (int i = 0; i < 10; i++) {
            source.add(new Random().nextInt(100));
        }

        System.out.println(source);

        Runnable runnable = () -> syncList.addAll(source);

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(syncList);


    }
}
