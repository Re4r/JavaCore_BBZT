package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Exec420 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        HashSet<Integer> integers = new HashSet<>();
        HashSet<Integer> union = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            set.add(new Random().nextInt(100));
        }

        integers.addAll(set);

        int counter = 0;
        for (var o : set) {
            counter++;
            System.out.println(counter + " : " + o);
        }
        System.out.println("----------------------------");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            if ((Integer) iterator.next() % 2 != 0) {
                iterator.remove();
            }
        }

        int counter1 = 0;
        for (var o : set) {
            counter1++;
            System.out.println(counter1 + " : " + o);
        }
        System.out.println("----------------------------");

        System.out.println(set.size());
        System.out.println("----------------------------");

        for (Integer i : integers) {
            System.out.println(i);
        }
        System.out.println("----------------------------");

        union.addAll(set);
        union.addAll(integers);

        for (Integer i : union) {
            System.out.println(i);
        }
        System.out.println("----------------------------");






    }
}
