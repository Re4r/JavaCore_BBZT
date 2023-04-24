package set;

import java.util.HashSet;
import java.util.Random;
import java.util.function.Predicate;

public class Exec4202 {
    public static void main(String[] args) {

        HashSet<Integer> integerHashSet1 = new HashSet<>();
        HashSet<Integer> integerHashSet2 = new HashSet<>();


        for (int i = 0; i < 20; i++) {
            integerHashSet1.add(new Random().nextInt(10));
            integerHashSet2.add(new Random().nextInt(10));
        }

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(integerHashSet1);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(integerHashSet2);
        System.out.println("----------------------------------------------------------------------------------------");

        HashSet<Integer> union = new HashSet<>(integerHashSet1);
        union.addAll(integerHashSet2);
        System.out.println(union);
        System.out.println("----------------------------------------------------------------------------------------");

        HashSet<Integer> intersect = HashSet.newHashSet(10);
        intersect.addAll(integerHashSet1);
        intersect.retainAll(integerHashSet2);
        System.out.println(intersect);
        System.out.println("----------------------------------------------------------------------------------------");

        HashSet<Integer> subtract = new HashSet<>(integerHashSet2);
        subtract.removeAll(integerHashSet1);
        System.out.println(subtract);
        System.out.println("----------------------------------------------------------------------------------------");

        Predicate<Integer> predicate = (x) -> x > 5 && x < 9;

        HashSet<Integer> hashSet = new HashSet<>(integerHashSet1);
        hashSet.removeIf(predicate);
        System.out.println(hashSet);
        System.out.println("----------------------------------------------------------------------------------------");




    }
}
