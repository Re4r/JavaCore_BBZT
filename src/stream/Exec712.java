package stream;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

public class Exec712 {
    public static void main(String[] args) {

        Random random = new Random();
        Supplier<Node> nodeSupplier = () -> {
            return new Node(random.nextInt(1000), random.nextDouble(100));
        };

        Set<Node> nodeSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            nodeSet.add(nodeSupplier.get());
        }

        System.out.println("-------------------------------------------------------");
        nodeSet.forEach(System.out::println);
        System.out.println("-------------------------------------------------------");

        long count = nodeSet.stream().count();
        System.out.println(count);
        System.out.println("-------------------------------------------------------");




    }
}
