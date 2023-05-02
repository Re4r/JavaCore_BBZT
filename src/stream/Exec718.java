package stream;

import java.util.Arrays;
import java.util.Random;

public class Exec718 {
    public static void main(String[] args) {

        double[] array = new double[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextDouble(1000);
        }

//        Arrays.stream(array).forEach(System.out::println);

    }
}
