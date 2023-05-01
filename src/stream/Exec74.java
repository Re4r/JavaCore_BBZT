package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Exec74 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Supplier<Integer> supplier = () -> new Random().nextInt(100);

    }
}
