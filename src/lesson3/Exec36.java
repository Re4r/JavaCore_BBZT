package lesson3;

import java.util.ArrayList;
import java.util.List;

public class Exec36 {
    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<Double> doubles1 = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        doubles1.add(1.34);
        doubles1.add(4.97);
        doubles1.add(89.94);

        integers.add(4);
        integers.add(7);
        integers.add(79);

        System.out.println(summator(doubles1));
        System.out.println(summator(integers));

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

    public static double summator(List<? extends Number> numbers) {
        double result = 0;
        for (Number n : numbers) {
            result += n.doubleValue();
        }
        return result;
    }
}
