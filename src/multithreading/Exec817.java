package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exec817 {

    private static long value = 1_000_000_000L;
    private static long sum;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<Long>> futureList = new ArrayList<>();

        long valueDevidedBy10 = value / 10;

        for (int i = 0; i < 10; i++) {
            long from = valueDevidedBy10 * i + i;
            long to = valueDevidedBy10  * (i + 1);
        }


    }
}

class PartialSum implements Callable<Long> {
    private long from;
    private long to;
    private long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println("Sum from: " + from + " to " + to + " > " + localSum);
        return localSum;
    }
}
