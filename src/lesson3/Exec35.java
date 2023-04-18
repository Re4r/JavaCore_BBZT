package lesson3;

public class Exec35 {
    public static void main(String[] args) {

        Special<Integer> special = new Special<>(100);
        Special<Double> special1 = new Special<>(100.0);
        System.out.println(special.getValue());
        System.out.println(special1.getValue());
        System.out.println(special.getValue() + special1.getValue());

    }
}

class Special<T extends Number> {
    private T value;

    public Special(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Special{" +
                "value=" + value +
                '}';
    }
}


