package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Exec418 {
    public static void main(String[] args) {

        LinkedHashMap<Integer, Element> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);

        for (int i = 1; i <= 10; i++) {
            linkedHashMap.put(i, new Element());
        }

        for (Map.Entry<Integer, Element> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("----------------------------------------------");

        System.out.println(linkedHashMap.get(10));
        System.out.println(linkedHashMap.get(3));
        System.out.println(linkedHashMap.get(1));
        linkedHashMap.put(12, new Element());
        System.out.println("----------------------------------------------");

        for (Map.Entry<Integer, Element> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("----------------------------------------------");


    }
}

class Element {

}
