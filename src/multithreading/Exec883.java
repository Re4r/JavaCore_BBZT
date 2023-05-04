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

    static final Synchcro SYNCHCRO;

    static {
        SYNCHCRO = new Synchcro();
    }

    void mobileCall() {
        synchronized (SYNCHCRO) {
            System.out.println("Mobile call starts...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Modile call ends...");
        }
    }

    void skypeCall() {
        synchronized (SYNCHCRO) {
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
        synchronized (SYNCHCRO) {
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

class Synchcro {
}
