package multithreading;

public class Exec816 {

    static int factorialResult;

    public static void main(String[] args) {

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
            for (int i = 1; i < f; i++) {
                result *= i;
            }
            Exec816.factorialResult = result;
        }
    }
}
