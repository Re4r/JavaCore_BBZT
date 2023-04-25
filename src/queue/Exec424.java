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
        System.out.println("-------------------------------");


        PriorityQueue<Code> codePriorityQueue = new PriorityQueue<>();

        for (int i = 0; i < 10; i++) {
            codePriorityQueue.offer(new Code(new Random().nextDouble(100)));
        }

        for (Code code : codePriorityQueue) {
            System.out.println(code);
        }
        System.out.println("-------------------------------");

        for (int i = 0; i < codePriorityQueue.size(); i++) {
            System.out.println(codePriorityQueue.peek());

        }
    }
}

final class Code implements Comparable<Code> {
    private final int id;

    public Code(int id) {
        this.id = id;
    }

    public int getId() {
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

        return getId() == code.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }


    @Override
    public int compareTo(@NotNull Code o) {
        return Integer.compare(this.id, o.id);
    }
}
