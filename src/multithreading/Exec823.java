package multithreading;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exec823 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " > " + " ENDS WORK");

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "AAA");
        hashMap.put(2, "BBB");
        hashMap.put(3, "CCC");
        hashMap.put(4, "DDD");
        hashMap.put(5, "EEE");

        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                Iterator<Integer> iterator = hashMap.keySet().iterator();
                while (iterator.hasNext()) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Integer i = iterator.next();
                    System.out.println(i + " > " + hashMap.get(i));
                }

            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                for (Map.Entry entry : hashMap.entrySet()) {
                    entry.setValue("SSS");
                }
            }
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();

        executorService.execute(runnable1);
        executorService1.execute(runnable2);

        executorService.shutdown();
        executorService1.shutdown();

        try {
            executorService.awaitTermination(3, TimeUnit.SECONDS);
            executorService1.awaitTermination(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(Thread.currentThread().getName() + " > " + " ENDS WORK");







    }
}
