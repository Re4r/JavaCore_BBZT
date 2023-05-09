package multithreading;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exec823 {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "AAA");
        hashMap.put(2, "BBB");
        hashMap.put(3, "CCC");
        hashMap.put(4, "DDD");
        hashMap.put(5, "EEE");

        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Runnable runnable = new Runnable() {
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




    }
}
