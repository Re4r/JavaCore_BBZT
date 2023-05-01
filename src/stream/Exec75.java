package stream;

import java.util.Arrays;
import java.util.Random;

public class Exec75 {
    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }

        System.out.println(Arrays.toString(array));

    }
}
