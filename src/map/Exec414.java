package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Exec414 {
    public static void main(String[] args) {

        Map<Integer, Cobalt> map = new HashMap<>();
        mapFiller(map, 10);
        showMap(map);
        showHashCode(map);



    }

    static void mapFiller(Map<Integer, Cobalt> map, Integer quantity) {
        Random random = new Random();
        for (int i = 0; i < quantity; i++) {
            map.put(random.nextInt(100)
                    , new Cobalt(random.nextInt(100)
                            , random.nextInt(100)
                            , random.nextDouble(100)));
        }
    }
    static <K, V> void showMap(Map<K, V> map) {
        int counter = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            counter++;
            System.out.println(counter + " key: " + entry.getKey() + " value: " + entry.getValue());
        }
        System.out.println("------------------------------------------------------------------------");
    }

    static <K, V> void showHashCode(Map<K, V> map) {
        int counter = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            counter++;
            System.out.println(counter + " value_hashcode: " + entry.getValue().hashCode());
        }
        System.out.println("------------------------------------------------------------------------");
    }
}

class Cobalt {
    private int id;
    private int source;
    private double code;

    public Cobalt(int id, int source, double code) {
        this.id = id;
        this.source = source;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public int getSource() {
        return source;
    }

    public double getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Cobalt = " + '(' +
                "id: " + id +
                ", source: " + source +
                ", code: " + code + ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cobalt cobalt)) return false;

        if (getId() != cobalt.getId()) return false;
        if (getSource() != cobalt.getSource()) return false;
        return Double.compare(cobalt.getCode(), getCode()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getId();
        result = 31 * result + getSource();
        temp = Double.doubleToLongBits(getCode());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
