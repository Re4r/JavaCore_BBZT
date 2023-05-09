package multithreading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class Exec824 {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> integerArrayList = new CopyOnWriteArrayList<>();

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
                System.out.println("------------------------------------------------------------------------------");
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                for (Integer i : integerArrayList) {
                    if (i > 50) {
                        integerArrayList.set(integerArrayList.indexOf(i), new Random().nextInt(1000));
                    }
                }
                System.out.println("---------------------------------------------------------------------");
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println(integerArrayList);

    }
}
