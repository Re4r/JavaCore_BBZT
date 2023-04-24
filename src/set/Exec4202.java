package set;

import java.util.HashSet;
import java.util.Random;

public class Exec4202 {
    public static void main(String[] args) {

        HashSet<Integer> integerHashSet1 = new HashSet<>();
        HashSet<Integer> integerHashSet2 = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            integerHashSet1.add(new Random().nextInt(100));
            integerHashSet2.add(new Random().nextInt(100));
        }

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(integerHashSet1);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(integerHashSet2);
        System.out.println("----------------------------------------------------------------------------------------");

    }
}
