package multithreading;

import java.util.concurrent.Callable;

public class Exec817 {

    private static long value = 1_000_000_000L;
    private static long sum;

    public static void main(String[] args) {


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

}
