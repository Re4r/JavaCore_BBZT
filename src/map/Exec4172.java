package map;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Exec4172 {
    public static void main(String[] args) {

        TreeMap<Artefact, Double> treeMap = new TreeMap<>();
        TreeMap<Artefact, Double> artefactDoubleTreeMap = new TreeMap<>(Comparator.comparingDouble(Artefact::code));

        for (int i = 0; i < 10; i++) {
            treeMap.put(new Artefact(new Random().nextInt(100), new Random().nextDouble(100)),
                    new Random().nextDouble(100));
        }

        for (Map.Entry<Artefact, Double> entry : treeMap.entrySet()) {
            System.out.println("key: " + entry.getKey() + " / " + "value: "  + entry.getValue());
        }
        System.out.println("-----------------------------------------------------------------------");

        Map<Artefact, Double> treeMap1 = treeMap.descendingMap();

        for (Map.Entry<Artefact, Double> entry : treeMap1.entrySet()) {
            System.out.println("key: " + entry.getKey() + " / " + "value: "  + entry.getValue());
        }
        System.out.println("-----------------------------------------------------------------------");

        artefactDoubleTreeMap.putAll(treeMap);

        for (Map.Entry<Artefact, Double> entry : artefactDoubleTreeMap.entrySet()) {
            System.out.println("key: " + entry.getKey() + " / " + "value: "  + entry.getValue());
        }
        System.out.println("-----------------------------------------------------------------------");

    }
}

record Artefact(int id, double code) implements Comparable<Artefact> {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artefact artefact)) return false;

        if (id() != artefact.id()) return false;
        return Double.compare(artefact.code(), code()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id();
        temp = Double.doubleToLongBits(code());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(@NotNull Artefact o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return "(Artefact: " +
                "id: " + id +
                ", code: " + code + ")";
    }
}
