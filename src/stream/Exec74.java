package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

public class Exec74 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Supplier<Integer> supplier = () -> new Random().nextInt(100);

        for (int i = 0; i < 10; i++) {
            list.add(supplier.get());
        }

//        list.forEach(System.out::println);
        System.out.println(list);
        System.out.println("-------------------------------------------------------------");

        int m = list.stream().reduce((accumulator, element) -> accumulator + element).get();
        System.out.println(m);
        System.out.println("-------------------------------------------------------------");

        List<Integer> integers = new ArrayList<>();
//        integers.add(100);

        Optional<Integer> optional = integers.stream().reduce((acc, element) -> acc + element);

        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("Not Present");
        }
        System.out.println("-------------------------------------------------------------");

        int s = list.stream().reduce(1, (integer, integer2) -> integer - integer2);
        System.out.println(s);
        System.out.println("-------------------------------------------------------------");

        List<String> list2 = new ArrayList<>();

        list2.add("AAA");
        list2.add("BBB");
        list2.add("CCC");
        list2.add("DDD");
        list2.add("EEE");
        list2.add("FFF");

        String s1 = list2.stream().reduce(Exec74::concatination).get();
        System.out.println(s1);
        System.out.println("-------------------------------------------------------------");



    }
    static String concatination(String s1, String s2) {
        return s1 + s2;
    }
}
