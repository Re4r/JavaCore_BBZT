package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Exec423 {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("AAA");
        queue.offer("CCC");
        queue.offer("EEE");
        queue.offer("DDD");
        queue.offer("BBB");
        queue.offer("FFF");

        System.out.println(queue);
        String element = queue.poll();
        System.out.println(element);
        System.out.println(queue);
        System.out.println(queue.peek());

    }
}
