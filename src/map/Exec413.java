package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Exec413 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(new Random().nextInt(100), Double.toString(new Random().nextDouble(100)));
        }

        showMap(map);

        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(new Random().nextInt(100), Double.toString(new Random().nextDouble(100)));
        }

        showMap(map);

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            if ((Integer) pair.getKey() > 50) {
                iterator.remove();
            }
        }

        showMap(map);

        for (int i = 0; i < map.size(); i++) {
            boolean key = map.containsKey(new Random().nextInt(100));
            boolean value = map.containsValue(Double.toString(new Random().nextDouble(100)));
            System.out.println("key: " + key + " value: " + value);

        }
        System.out.println("-------------------------------------------------------------");

        System.out.println(map.keySet());
        System.out.println(map.values());



    }

    static <K, V> void showMap(Map<K, V> map) {
        int counter = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            counter++;
            System.out.println(counter + " / " + entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("size: " + map.size());
        System.out.println("-------------------------------------------------------------");
    }
}
