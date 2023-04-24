package set;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class Exec421 {
    public static void main(String[] args) {

        TreeSet<Integer> integerTreeSet = new TreeSet<>();

        for (int i = 0; i < 25; i++) {
            integerTreeSet.add(new Random().nextInt(50));
        }

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(integerTreeSet);
        System.out.println("----------------------------------------------------------------------------------------");

        Comparator<Unreal> idComparator = new Comparator<Unreal>() {
            @Override
            public int compare(Unreal o1, Unreal o2) {
                return Integer.compare(o1.getId(), o2.getId());
            }
        };

        Comparator<Unreal> codeComparator = new Comparator<Unreal>() {
            @Override
            public int compare(Unreal o1, Unreal o2) {
                return Double.compare(o1.getCode(), o2.getCode());
            }
        };

        TreeSet<Unreal> unrealSet = new TreeSet<>(idComparator);

        for (int i = 0; i < 10; i++) {
            unrealSet.add(new Unreal(new Random().nextInt(10), new Random().nextDouble(10)));
        }

        TreeSet<Unreal> unrealSet1 = new TreeSet<>(codeComparator);

        for (int i = 0; i < 10; i++) {
            unrealSet1.add(new Unreal(new Random().nextInt(10), new Random().nextDouble(10)));
        }

        unrealSet.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------------------");
        unrealSet1.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------------------");

        Unreal unreal = new Unreal(new Random().nextInt(10), new Random().nextDouble(10));
        System.out.println(unreal);
        System.out.println(unrealSet.headSet(unreal));
//        System.out.println(unrealSet1.headSet(unreal));
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(unreal);
        System.out.println(unrealSet.tailSet(unreal));
//        System.out.println(unrealSet1.tailSet(unreal));
        System.out.println("----------------------------------------------------------------------------------------");



    }
}

class Unreal {
    private int id;
    private double code;

    public Unreal(int id, double code) {
        this.id = id;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public double getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Unreal{" +
                "id=" + id +
                ", code=" + code +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Unreal unreal)) return false;

        if (getId() != unreal.getId()) return false;
        return Double.compare(unreal.getCode(), getCode()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getId();
        temp = Double.doubleToLongBits(getCode());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
