package multithreading;

public class Exec89 {
    public static void main(String[] args) {

    }
}

class Market {
    private int breadCount;

    synchronized void getBread() {
        while (breadCount == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            breadCount--;
            System.out.println("Customer buy 1 bread");
            System.out.println("Qantity of bread in the market: " + breadCount);
            notify();
        }
    }
}
