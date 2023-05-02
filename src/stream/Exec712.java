package stream;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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

        Map<Integer, List<Node>> map1 = nodeSet.stream()
                .collect(Collectors.groupingBy(Node::getId));

        for (Map.Entry entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("-------------------------------------------------------");

        Map<Double, List<Node>> map2 = nodeSet.stream()
                .collect(Collectors.groupingBy(Node::getNumber));

        for (Map.Entry entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("-------------------------------------------------------");


    }
}
