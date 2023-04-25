package queue;

import java.util.ArrayDeque;

public class Exec425 {
    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.addFirst(10);
        arrayDeque.addLast(20);
        arrayDeque.offer(11);
        arrayDeque.offer(78);
        arrayDeque.addLast(45);
        arrayDeque.offer(99);

        System.out.println(arrayDeque);

        arrayDeque.removeFirst();
        arrayDeque.removeLast();

        System.out.println(arrayDeque);

    }
}
