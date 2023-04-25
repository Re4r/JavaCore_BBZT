package queue;

import org.jetbrains.annotations.NotNull;

import java.util.PriorityQueue;
import java.util.Random;

public class Exec424 {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue1 = new PriorityQueue<>();

        for (int i = 0; i < 10; i++) {
            queue1.add(new Random().nextInt(100));
        }

        System.out.println(queue1);
    }
}

class Code implements Comparable<Code> {
    private double id;

    public Code(double id) {
        this.id = id;
    }

    public double getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Code: " +
                "id: " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Code code)) return false;

        return Double.compare(code.getId(), getId()) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getId());
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public int compareTo(@NotNull Code o) {
        return 0;
    }
}
