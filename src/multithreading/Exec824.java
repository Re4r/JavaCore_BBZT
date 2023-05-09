package multithreading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Exec824 {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            integerArrayList.add(new Random().nextInt(100));
        }

        System.out.println(integerArrayList);

        System.out.println("--------------------------------------------------------------------------------------");

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                Iterator<Integer> iterator = integerArrayList.iterator();
                while (iterator.hasNext()) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(iterator.next());
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                Iterator<Integer> iterator = integerArrayList.iterator();
                while (iterator.hasNext()) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    Integer x = iterator.next();
                    if (x > 50) {
                        iterator.remove();
                    } else {
                        integerArrayList.set(integerArrayList.indexOf(x), new Random().nextInt(1000));
                    }
                }
            }
        };


    }
}
