package lesson3;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Exec33 {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();

        integers.add(111);
        integers.add(222);
        strings.add("Hekko");
        strings.add("Lawwe");

        System.out.println(special(integers));
        System.out.println(special(strings));

    }

    public static <T> T special(ArrayList<T> list) {
        T t = list.get(0);
        return t;
    }
}
