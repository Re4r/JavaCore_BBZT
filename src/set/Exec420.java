package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Exec420 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            set.add(new Random().nextInt(100));
        }

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
    }
}
