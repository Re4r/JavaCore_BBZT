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

    }
}
