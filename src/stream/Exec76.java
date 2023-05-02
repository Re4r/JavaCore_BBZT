package stream;

import java.util.*;
import java.util.function.Supplier;

public class Exec76 {
    public static void main(String[] args) {

        int[] ints = new int[50];

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt(100);
            }
        };

        for (int i = 0; i < ints.length; i++) {
            ints[i] = supplier.get();
        }

        System.out.println(Arrays.toString(ints));
        System.out.println("---------------------------------------------------------------------------------------");

        int x = Arrays.stream(ints)
                .filter(v -> v % 10 == 0)
                .map(v -> v * 10)
                .sorted()
                .reduce((acc, v) -> acc + v)
                .getAsInt();

        System.out.println(x);
        System.out.println("---------------------------------------------------------------------------------------");

        Set<Mod> modSet = new HashSet<>();

        Supplier<Mod> modSupplier = new Supplier<Mod>() {
            @Override
            public Mod get() {
                return new Mod("AQ".concat(String.valueOf(new Random().nextInt(1000))),
                        new Random().nextInt(10000));
            }
        };


        for (int i = 0; i < 10; i++) {
            modSet.add(modSupplier.get());
        }

        modSet.forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------");


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

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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
