package multithreading;

import java.util.ArrayList;
import java.util.Random;

public class Exec822 {
    public static void main(String[] args) {

        ArrayList<Integer> source = new ArrayList<>();

        ArrayList<Integer> target = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            source.add(new Random().nextInt(100));
        }

        System.out.println(source);

        Runnable runnable = () -> target.addAll(source);

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);




    }
}
