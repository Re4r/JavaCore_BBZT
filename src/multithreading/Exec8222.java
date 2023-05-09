package multithreading;

import java.util.ArrayList;
import java.util.Iterator;

public class Exec8222 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Iterator<Integer> integerIterator = arrayList.iterator();
                while (integerIterator.hasNext()) {
                    System.out.println(integerIterator.next());
                }
            }
        };




    }
}
