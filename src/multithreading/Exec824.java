package multithreading;

import java.util.ArrayList;
import java.util.Random;

public class Exec824 {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            integerArrayList.add(new Random().nextInt(100));
        }

        System.out.println(integerArrayList);
    }
}
