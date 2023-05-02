package stream;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class Exec76 {
    public static void main(String[] args) {

        int[] ints = new int[50];

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt(100);
            }
        };

        for (int i = 0; i < ints.length; i++) {
            ints[i] = supplier.get();
        }

        System.out.println(Arrays.toString(ints));

        int x = Arrays.stream(ints)
                .filter(v -> v % 10 == 0)
                .map(v -> v * 10)
                .sorted()
                .reduce((acc, v) -> acc + v)
                .getAsInt();

        System.out.println(x);
    }
}
