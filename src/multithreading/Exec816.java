package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exec816 {

    static int factorialResult;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Factorial factorial = new Factorial(5);

        executorService.execute(factorial);

        executorService.shutdown();

        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(factorialResult);
    }
}

final class Factorial implements Runnable {
    private int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("wrong number, try again...");
            return;
        } else {
            int result = 1;
            for (int i = 1; i <= f; i++) {
                result *= i;
            }
            Exec816.factorialResult = result;
        }
    }
}
