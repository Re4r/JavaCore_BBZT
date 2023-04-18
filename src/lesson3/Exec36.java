package lesson3;

import java.util.ArrayList;
import java.util.List;

public class Exec36 {
    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        doubles.add(1.1);
        doubles.add(2.2);
        strings.add("hello");
        strings.add("world");

        show(doubles);
        show(strings);
    }

    public static void show(List<?> list) {
        System.out.println(list);
    }
}
