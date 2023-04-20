package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exec45 {
    public static void main(String[] args) {

        StringBuilder builder1 = new StringBuilder("AAA");
        StringBuilder builder2 = new StringBuilder("BBB");
        StringBuilder builder3 = new StringBuilder("CCC");
        StringBuilder builder4 = new StringBuilder("DDD");
        StringBuilder builder5 = new StringBuilder("EEE");

        StringBuilder[] builders = {builder1, builder2, builder3, builder4, builder5};

        List<StringBuilder> stringBuilderList = Arrays.asList(builders);

        System.out.println(stringBuilderList);

        builders[builders.length - 1] = new StringBuilder("FFF");
        for (var sb : builders) {
            sb.append("\\");
        }

        System.out.println(stringBuilderList);

        List<StringBuilder> stringBuilderList1 = new ArrayList<>(stringBuilderList);

        stringBuilderList1.remove(builder1);
        System.out.println(stringBuilderList1);
        stringBuilderList.removeAll(stringBuilderList1);
        System.out.println(stringBuilderList);




    }
}
