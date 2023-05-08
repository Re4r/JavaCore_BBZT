package multithreading;

import java.util.concurrent.*;

public class Exec8162 {

    static int factorialResult;
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(5);
        Future<Integer> future = executorService.submit(factorial2);

        try {
            factorialResult = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(e.getCause());
        } catch (ExecutionException e) {
            e.printStackTrace();
            System.out.println(e.getCause());
        }

    }
}

class Factorial2 implements Callable<Integer> {

    private int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("wrong number!");
        } else {
            int result = 1;
            for (int i = 0; i <= f; i++) {
                result *= i;
            }
            return result;
        }
    }
}
