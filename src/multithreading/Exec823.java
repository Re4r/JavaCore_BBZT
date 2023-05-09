package multithreading;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exec823 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " > " + " ENDS WORK");

        ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();

        hashMap.put(1, "AAA");
        hashMap.put(2, "BBB");
        hashMap.put(3, "CCC");
        hashMap.put(4, "DDD");
        hashMap.put(5, "EEE");
        hashMap.put(6, "FFF");

        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("----------------------------------------------------");

        Runnable runnable1 = () -> {
            for (Integer i : hashMap.keySet()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i + " > " + hashMap.get(i) + " : " + Thread.currentThread().getName());
            }
            System.out.println("----------------------------------------------------");
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            for (Map.Entry entry : hashMap.entrySet()) {
                entry.setValue("SSS");
                System.out.println(Thread.currentThread().getName() + " done operation");
            }
            System.out.println("----------------------------------------------------");
        };

        ExecutorService executorService1 = Executors.newFixedThreadPool(3);
        ExecutorService executorService2 = Executors.newFixedThreadPool(3);

        executorService1.execute(runnable1);
        executorService2.execute(runnable2);



        try {
            executorService1.awaitTermination(1, TimeUnit.SECONDS);
            executorService2.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("----------------------------------------------------");

        System.out.println(Thread.currentThread().getName() + " > " + " ENDS WORK");

    }
}
