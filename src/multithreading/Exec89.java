package multithreading;

public class Exec89 {
    public static void main(String[] args) {

        Market market = new Market();

        Producer producer = new Producer(market);
        Customer customer = new Customer(market);

        Thread threadProducer = new Thread(producer);
        Thread threadCustomer = new Thread(customer);

        threadProducer.start();
        threadCustomer.start();

    }
}

class Market {
    private static int breadCount = 0;
    private static final Object LOCK = new Object();

    void getBread() {
        synchronized (LOCK) {
            while (breadCount < 1) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount--;
            System.out.println("Customer buy 1 bread");
            System.out.println("Quantity of bread in the market: " + breadCount);
            LOCK.notify();
        }

    }

     void putBread() {
        synchronized (LOCK) {
            while (breadCount >= 1) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount++;
            System.out.println("Producer added 1 bread to the market");
            System.out.println("Quantity of bread in the market: " + breadCount);
            LOCK.notify();
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
