package lambda;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

public class Exec632 {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            integers.add(new Random().nextInt(1000));
        }

        System.out.println(integers);
        System.out.println("----------------------------------------------------------------------------------------");

    }
}
