package multithreading;

public class Exec883 {
    public static void main(String[] args) {

    }
}

class Call {

    void mobileCall() {
        System.out.println("Mobile call starts...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Modile call ends...");
    }

    void skypeCall() {
        System.out.println("Skype call starts...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Skype call ends...");
    }

    void whatsUpCall() {
        System.out.println("WhatsUp call starts...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("WhatsUp call ends...");
    }
}
