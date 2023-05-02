package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Exec718 {
    public static void main(String[] args) {

        double[] array = new double[1000];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextDouble(1000);
        }

//        Arrays.stream(array).forEach(System.out::println);

        List<Double> list = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        Set<Double> set = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));

//        list.forEach(System.out::println);
//        System.out.println("-----------------------------------");
//
//        set.forEach(System.out::println);
//        System.out.println("-----------------------------------");

        double sum = list.parallelStream()
                .mapToDouble(Double::doubleValue)
//                .map(operand -> Math.floor(operand))
                .sum();

        System.out.println(sum);
        System.out.println("-----------------------------------");

        double sum2 = set.stream()
                .parallel()
                .reduce(Double::sum)
//                .map(aDouble -> Math.floor(aDouble))
                .get();

        System.out.println(sum2);
        System.out.println("-----------------------------------");
        System.out.println(sum == sum2);
        System.out.println("-----------------------------------");

    }
}
