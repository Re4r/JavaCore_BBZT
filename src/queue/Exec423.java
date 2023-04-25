package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Exec423 {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("AAA");
        queue.add("CCC");
        queue.add("EEE");
        queue.add("DDD");
        queue.add("BBB");
        queue.add("FFF");

        System.out.println(queue);

    }
}
