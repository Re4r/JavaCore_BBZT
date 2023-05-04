package multithreading;

public class Exec883 {
    public static void main(String[] args) {

        Thread mobileCallThread = new Thread(new Runnable() {
            @Override
            public void run() {
                new Call().mobileCall();
            }
        });

        Thread skypeCallThread = new Thread(new Runnable() {
            @Override
            public void run() {
                new Call().skypeCall();
            }
        });

        Thread whatsupCallThread = new Thread(new Runnable() {
            @Override
            public void run() {
                new Call().whatsUpCall();
            }
        });

        mobileCallThread.start();
        skypeCallThread.start();
        whatsupCallThread.start();
    }
}

class Call {
    private static final Object LOCK;

    static {
        LOCK = new Object();
    }

    void mobileCall() {
        synchronized (LOCK) {
            System.out.println("Mobile call starts...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends...");
        }
    }

    void skypeCall() {
        synchronized (LOCK) {
            System.out.println("Skype call starts...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends...");

        }
    }

    void whatsUpCall() {
        synchronized (LOCK) {
            System.out.println("WhatsUp call starts...");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WhatsUp call ends...");
        }
    }
}

