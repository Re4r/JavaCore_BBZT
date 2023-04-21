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

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
