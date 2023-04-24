package set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exec420 {
    public static void main(String[] args) {

        Set<Integer> doubleSet = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            doubleSet.add(new Random().nextInt(100));
        }
        int counter = 0;
        for (var o : doubleSet) {
            counter++;
            System.out.println(counter + " : " + o);
        }
    }
}
