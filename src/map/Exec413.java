package map;

import java.util.HashMap;
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

    }

    static <K, V> void showMap(Map<K, V> map) {
        int counter = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            counter++;
            System.out.println(counter + " / " + entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("-------------------------------------------------------------");
    }
}
