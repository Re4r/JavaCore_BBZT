package set;

import java.util.Random;
import java.util.TreeSet;

public class Exec421 {
    public static void main(String[] args) {

        TreeSet<Integer> integerTreeSet = new TreeSet<>();

        for (int i = 0; i < 25; i++) {
            integerTreeSet.add(new Random().nextInt(50));
        }

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(integerTreeSet);
        System.out.println("----------------------------------------------------------------------------------------");



    }
}
