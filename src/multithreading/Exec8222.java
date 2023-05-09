package multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exec8222 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " > STARTS WORK...");

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }

        List<Integer> listSync = Collections.synchronizedList(arrayList);

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                synchronized (listSync) {
                    Iterator<Integer> integerIterator = listSync.iterator();
                    while (integerIterator.hasNext()) {
                        System.out.println(integerIterator.next());
                    }
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                synchronized (listSync) {
                    Iterator<Integer> iterator = listSync.iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next() % 2 == 0) {
                            iterator.remove();
                        }
                    }
                }
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
            e.printStackTrace();
        }

        System.out.println(listSync);
        System.out.println(arrayList);
        System.out.println(Thread.currentThread().getName() + " > ENDS WORK");


    }
}
