package stream;

import java.util.Arrays;
import java.util.Random;

public class Exec73 {
    public static void main(String[] args) {

        int[] ints = new int[20];

        for (int i = 0; i < ints.length; i++) {
            Random random = new Random();
            ints[i] = random.nextInt(1000);
        }

        System.out.println(Arrays.toString(ints));
        System.out.println("----------------------------------------------------------------------------------------");

        Arrays.stream(ints).forEachOrdered(Exec73::accept);
//        System.out.println(Arrays.toString(ints));

    }

    private static void accept(int value) {
        value *= 10;
        value /= 3;
        System.out.println(value);
    }
}
