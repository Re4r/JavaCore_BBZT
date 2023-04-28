package stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Exec73 {
    public static void main(String[] args) {

        int[] ints = new int[20];

        for (int i = 0; i < ints.length; i++) {
            Random random = new Random();
            ints[i] = random.nextInt(1000);
        }

        System.out.println(Arrays.toString(ints));
        System.out.println("----------------------------------------------------------------------------------------");

//        Arrays.stream(ints).forEachOrdered(Tool::multiply);
//        System.out.println(Arrays.toString(ints));

        Stream<Integer> integerStream = Stream.of(1, 56, 78, 90, 43, 56, 67, 32);
        Stream<Integer> integerStream1 = integerStream.filter(i -> i > 50);
        integerStream1.forEach(System.out::println);

    }

    private static void accept(int value) {
        value *= 10;
        value /= 3;
        System.out.println(value);
    }
}

class Tool {
    static void multiply(int x) {
        x *= 100;
        System.out.println(x);
    }
}
