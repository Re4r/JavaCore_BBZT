package lesson3;

import java.util.ArrayList;

public class Exec35 {
    public static void main(String[] args) {

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(100.0);
        doubles.add(200.0);

        System.out.println(qwerty(doubles));

        Special<Integer> special = new Special<>(100);
        Special<Double> special1 = new Special<>(100.0);
        System.out.println(special.getValue());
        System.out.println(special1.getValue());
        System.out.println(special.getValue() + special1.getValue());



    }

    public static <T extends Double> T qwerty(ArrayList<T> ts) {
        return ts.get(0);
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


