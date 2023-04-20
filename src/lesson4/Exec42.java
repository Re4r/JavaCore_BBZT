package lesson4;

import java.util.ArrayList;
import java.util.List;

public class Exec42 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(20);

        for (int i = 0; i < 20; i++) {
            integers.add(i);
        }

        List<Integer> integers1 = new ArrayList<>(integers);

        System.out.println(integers);
        System.out.println(integers1);
        System.out.println(integers.size());
        System.out.println(integers1.size());
        System.out.println(integers.equals(integers1));
    }
}
