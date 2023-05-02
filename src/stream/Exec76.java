package stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exec76 {
    public static void main(String[] args) {

        int[] ints = new int[50];

        Supplier<Integer> supplier = () -> new Random().nextInt(100);

        for (int i = 0; i < ints.length; i++) {
            ints[i] = supplier.get();
        }

        System.out.println(Arrays.toString(ints));
        System.out.println("---------------------------------------------------------------------------------------");

        OptionalInt xo = Arrays.stream(ints)
                .filter(v -> v % 10 == 0)
                .map(v -> v * 10)
                .sorted()
                .reduce(Integer::sum);

        int xop = 0;
        if (xo.isPresent()) {
            xop = xo.getAsInt();
        }

        System.out.println(xop + " !!!!!!!!!!!!!!!!");
        System.out.println("---------------------------------------------------------------------------------------");

        Set<Mod> modSet = new HashSet<>();

        Supplier<Mod> modSupplier = () -> new Mod("AQ".concat(String.valueOf(new Random().nextInt(100000))),
                new Random().nextInt(10000));


        for (int i = 0; i < 10; i++) {
            modSet.add(modSupplier.get());
        }

        modSet.forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------");

        Predicate<Mod> modPredicate = mod -> mod.getCode() < 3000;

        Comparator<Mod> modCodeComparator = Comparator.comparingInt(Mod::getCode);

        Set<Mod> mods = modSet.stream()
                .filter(modPredicate)
                .map(mod -> mod.setName(mod.getName().concat("sec")))
                .sorted(modCodeComparator)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        mods.forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------");

        Set<String> stringSet = modSet.stream()
                .map(Mod::getName)
                .collect(Collectors.toCollection(TreeSet::new));

        stringSet.forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------");

        int sx = modSet.stream().mapToInt(Mod::getCode).sum();
        System.out.println(sx);

        Optional<Mod> xe = modSet.stream()
                .max(modCodeComparator);
        int maxValue = 0;
        if (xe.isPresent()) {
            maxValue = xe.get().getCode();
        } else {
            System.out.println("Not present");
        }

        System.out.println(maxValue + " **********************");
        System.out.println("---------------------------------------------------------------------------------------");

        Set<Integer> integerSet = modSet.stream()
                .map(Mod::getCode)
                .collect(Collectors.toCollection(HashSet::new));

        integerSet.forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------");

        Stream<String> stringStream = integerSet.stream()
                .map(String::valueOf);

        Stream<String> stringStream1 = stringSet.stream()
                .map(String::toUpperCase);

        Set<String> setAll = Stream.concat(stringStream, stringStream1)
                .collect(Collectors.toCollection(HashSet::new));

        setAll.forEach(System.out::println);


    }
}

class Mod {
    private String name;
    private int code;

    public Mod(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public Mod setName(String name) {
        this.name = name;
        return this;
    }

    public int getCode() {
        return code;
    }

    public Mod setCode(int code) {
        this.code = code;
        return this;
    }

    @Override
    public String toString() {
        return "Mod{" +
                "name: '" + name + '\'' +
                ", code: " + code +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mod mod)) return false;

        if (getCode() != mod.getCode()) return false;
        return getName() != null ? getName().equals(mod.getName()) : mod.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getCode();
        return result;
    }
}
