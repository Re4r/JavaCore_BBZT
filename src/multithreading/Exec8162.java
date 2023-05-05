package multithreading;

import java.util.concurrent.Callable;

public class Exec8162 {
    public static void main(String[] args) {

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
            throw new Exception("wrong number");
        } else {
            int result = 1;
            for (int i = 0; i <= f; i++) {
                result *= i;
            }
            return result;
        }
    }
}
