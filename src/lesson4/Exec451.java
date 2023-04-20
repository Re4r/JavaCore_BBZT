package lesson4;

import java.util.ArrayList;
import java.util.List;

public class Exec451 {
    public static void main(String[] args) {

        StringBuilder builder1 = new StringBuilder("AAA");
        StringBuilder builder2 = new StringBuilder("BBB");
        StringBuilder builder3 = new StringBuilder("CCC");
        StringBuilder builder4 = new StringBuilder("DDD");
        StringBuilder builder5 = new StringBuilder("EEE");

        List<StringBuilder> stringBuilderList = new ArrayList<>();

        stringBuilderList.add(builder1);
        stringBuilderList.add(builder2);
        stringBuilderList.add(builder3);
        stringBuilderList.add(builder4);
        stringBuilderList.add(builder5);

        List<StringBuilder> stringBuilderList1 = new ArrayList<>(stringBuilderList);

        System.out.println(stringBuilderList);
        System.out.println(stringBuilderList1);

        System.out.println(stringBuilderList.equals(stringBuilderList1));

        stringBuilderList.set(0, new StringBuilder("JJJ"));

        System.out.println(stringBuilderList);

        System.out.println(stringBuilderList.equals(stringBuilderList1));

//        stringBuilderList.removeAll(stringBuilderList1);
        stringBuilderList.retainAll(stringBuilderList1);

        System.out.println(stringBuilderList);
        System.out.println(stringBuilderList1);

        System.out.println(stringBuilderList.containsAll(stringBuilderList1));
        System.out.println(stringBuilderList1.containsAll(stringBuilderList));

        List<StringBuilder> subListSbl1 = stringBuilderList1.subList(1, stringBuilderList1.size());
        System.out.println(subListSbl1);

        subListSbl1.addAll(stringBuilderList);
        System.out.println(subListSbl1);
        System.out.println(stringBuilderList1);






    }
}
