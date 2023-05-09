package multithreading;

import java.util.ArrayList;
import java.util.Random;

public class Exec822 {
    public static void main(String[] args) {

        ArrayList<Integer> source = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            source.add(new Random().nextInt(100));
        }

        System.out.println(source);
    }
}
