package multithreading;

import java.util.ArrayList;
import java.util.Iterator;

public class Exec8222 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                Iterator<Integer> integerIterator = arrayList.iterator();
                while (integerIterator.hasNext()) {
                    System.out.println(integerIterator.next());
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                Iterator<Integer> iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    if (iterator.next() % 2 == 0) {
                        iterator.remove();
                    }
                }
            }
        };




    }
}
