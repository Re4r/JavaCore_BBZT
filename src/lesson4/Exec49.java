package lesson4;

import java.util.ArrayList;
import java.util.Random;

public class Exec49 {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            integers.add(random.nextInt(100));
        }

        System.out.println(integers);
    }
}
