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

    synchronized void putBread() {
        while (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            breadCount++;
            System.out.println("Producer added 1 bread to the market");
            System.out.println("Qantity of bread in the market: " + breadCount);
            notify();
        }
    }
}

class Producer implements Runnable {

    private Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Customer implements Runnable {
    private Market market;

    public Customer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}
