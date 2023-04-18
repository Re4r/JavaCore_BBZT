package lesson3;

import java.util.ArrayList;
import java.util.List;

public class Exec31 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("111");
        list.add("333");
        list.add("444");

        int sum = 0;
        for (String s : list) {
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);

    }
}
