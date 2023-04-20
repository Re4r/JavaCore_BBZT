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
        StringBuilder[] builders2 = {builder1, builder2, builder3, builder4, builder5};

        List<StringBuilder> stringBuilderList = Arrays.asList(builders);
        List<StringBuilder> stringBuilderList2 = Arrays.asList(builders2);


        System.out.println(stringBuilderList);
        System.out.println(stringBuilderList2);
        System.out.println("------------------");

        builders[0] = new StringBuilder("FFF");
        builders2[0] = new StringBuilder("GGG");

//        for (var sb : builders) {
//            sb.append("\\");
//        }

        System.out.println(stringBuilderList);
        System.out.println(stringBuilderList2);
        System.out.println("------------------");

        stringBuilderList.removeAll(stringBuilderList2);
        System.out.println(stringBuilderList);






    }
}
