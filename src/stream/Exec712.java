package stream;

import java.util.*;
import java.util.function.Predicate;
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

        Predicate<Node> nodeNumberPredicate = node -> node.getNumber() < 50;
        Predicate<Node> nodeIdPredicate = node -> node.getId() > 500;

        Map<Boolean, List<Node>> map3 = nodeSet.stream()
                .collect(Collectors.partitioningBy(nodeIdPredicate));

        for (Map.Entry entry : map3.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("-------------------------------------------------------");

        Optional<Node> node = nodeSet.stream().findFirst();
        Node node1;
        if (node.isPresent()) node1 = node.get();
        System.out.println(node);
        System.out.println("-------------------------------------------------------");

        Node nodeMin = nodeSet.stream()
                .min(Comparator.comparingInt(Node::getId))
                .get();

        System.out.println(nodeMin + " MIN");
        System.out.println("-------------------------------------------------------");

        Node nodeMax = nodeSet.stream()
                .max(Comparator.comparingDouble(Node::getNumber))
                .get();

        System.out.println(nodeMax + " MAX");
        System.out.println("-------------------------------------------------------");

        nodeSet.stream()
                .filter(n -> n.getId() % 2 == 0)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("-------------------------------------------------------");

        nodeSet.stream()
                .filter(n -> n.getId() % 2 == 0)
                .skip(2)
                .forEach(System.out::println);

        System.out.println("-------------------------------------------------------");

        List<Integer> integerList = nodeSet.stream()
                .mapToInt(Node::getId)
                .boxed()
                .filter(i -> i % 2 != 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(integerList);
        System.out.println("-------------------------------------------------------");

        int sum = nodeSet.stream().mapToInt(Node::getId).sum();
        System.out.println(sum);

        System.out.println("-------------------------------------------------------");

        double avg = nodeSet.stream()
                .mapToInt(Node::getId)
                .average()
                .getAsDouble();

        System.out.println(avg);
        System.out.println("-------------------------------------------------------");

        double min = nodeSet.stream().mapToDouble(Node::getNumber).min().getAsDouble();
        double max = nodeSet.stream().mapToDouble(Node::getNumber).max().getAsDouble();

        System.out.println("min: " + min + " max: " + max);
        System.out.println("-------------------------------------------------------");




    }
}
