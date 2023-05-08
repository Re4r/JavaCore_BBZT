package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Exec817 {

    private static long value = 1_000_000_000L;
    private static long sum;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<Long>> futureList = new ArrayList<>();

        long valueDevidedBy10 = value / 10;

        for (int i = 0; i < 10; i++) {

            long from = valueDevidedBy10 * i + 1;
            long to = valueDevidedBy10  * (i + 1);

            PartialSum partialSumTask = new PartialSum(from, to);

            Future<Long> longFuture = executorService.submit(partialSumTask);

            futureList.add(longFuture);
        }

        for (Future<Long> future : futureList) {
            try {
                sum += future.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        executorService.shutdown();

        System.out.println("Global sum: " + sum);

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
//        System.out.println(Thread.currentThread().getName() + " starts work...");
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println(Thread.currentThread().getName() + " > Sum from: " + from + " to " + to + " > " + localSum);
//        System.out.println(Thread.currentThread().getName() + " ends work...");
        return localSum;
    }
}
