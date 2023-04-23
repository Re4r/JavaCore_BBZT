package map;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Exec417 {
    public static void main(String[] args) {

        TreeMap<Integer, Double> treeMap = new TreeMap<>();

        for (int i = 0; i < 10; i++) {
            treeMap.put(new Random().nextInt(1000), new Random().nextDouble(1000));
        }

        for (Map.Entry<Integer, Double> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("----------------------------------------------------------------");

        Map<? extends Integer, ? extends Double> map = treeMap.descendingMap();

        for (Map.Entry<? extends Integer, ? extends Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("----------------------------------------------------------------");

        Map<Integer, Double> map1 = treeMap.tailMap(150);

        for (Map.Entry<Integer, Double> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("----------------------------------------------------------------");

        Map<Integer, Double> map2 = treeMap.headMap(150);

        for (Map.Entry<Integer, Double> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("----------------------------------------------------------------");

        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
        System.out.println("----------------------------------------------------------------");











    }
}
