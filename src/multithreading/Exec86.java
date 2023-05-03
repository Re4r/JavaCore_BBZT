package multithreading;

public class Exec86 {
    public static void main(String[] args) {

    }
}

class Counter extends Thread {
    private boolean b = true;

    public boolean isB() {
        return b;
    }

    public Counter setB(boolean b) {
        this.b = b;
        return this;
    }

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop finished: " + counter);
    }
}
