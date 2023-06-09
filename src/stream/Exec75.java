package stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Exec75 {
    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }

        System.out.println(Arrays.toString(array));
        System.out.println("---------------------------------------");

        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("---------------------------------------");

        List<Nut> nutList = new ArrayList<>();

        Supplier<Nut> nutSupplier = () -> new Nut(new Random().nextInt(1000));

        Consumer<Nut> nutConsumer = nut -> nut.setId(nut.getId() + 1000);

        for (int i = 0; i < 10; i++) {
            nutList.add(nutSupplier.get());
        }

        nutList.forEach(System.out::println);
        System.out.println("---------------------------------------");

        for (Nut nut : nutList) {
            nutConsumer.accept(nut);
        }

        nutList.forEach(System.out::println);
        System.out.println("---------------------------------------");

        Comparator<Nut> nutComparator = Comparator.comparingInt(Nut::getId);

        List<Nut> sortedNut = nutList.stream().sorted(nutComparator).toList();

        sortedNut.forEach(System.out::println);
        System.out.println("---------------------------------------");

        Function<Integer, String> function = integer -> String.valueOf(integer).concat("AAA");

        List<String> strings = sortedNut.stream().map(nut -> function.apply(nut.getId())).toList();

        strings.forEach(System.out::println);
        System.out.println("---------------------------------------");

        strings = strings.stream().sorted().toList();

        strings.forEach(System.out::println);
        System.out.println("---------------------------------------");

        String s = strings.stream().reduce(String::concat).toString();
        System.out.println(s);

        System.out.println(s.toLowerCase());


    }
}

class Nut {
    private int id;

    public Nut(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Nut: " +
                "id: " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nut nut)) return false;

        return getId() == nut.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }
}
