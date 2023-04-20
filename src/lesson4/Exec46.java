package lesson4;

import java.util.ArrayList;
import java.util.Iterator;

public class Exec46 {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>(20);

        for (int i = 0; i < 20; i++) {
            integerArrayList.add(i);
        }

        System.out.println(integerArrayList);

        Iterator<Integer> integerIterator = integerArrayList.iterator();


        while (integerIterator.hasNext()) {
            if (integerIterator.next() % 2 != 0) {
                integerIterator.remove();
            }
        }

        System.out.println(integerArrayList);



    }
}
