package lesson4;

import java.util.ArrayList;

public class Exec43 {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> integers1 = new ArrayList<>();
        for (int i = 0; i < 20; i++) integers.add(i);
        System.out.println(integers);
        for (int i = 0; i < integers.size(); i++) integers1.add(i, integers.get(i));
        System.out.println(integers1);
        for (int i = 0; i < integers1.size(); i++) {
            integers1.set(i, integers.get(integers.size() - (i + 1)));
        }
        System.out.println(integers1);

    }
}
