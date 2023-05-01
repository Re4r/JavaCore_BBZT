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



    }
}
