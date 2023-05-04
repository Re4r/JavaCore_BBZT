package multithreading;

public class Exec812 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " > STARTS");

        UserThread userThread = new UserThread();
        DaemonThread daemonThread = new DaemonThread();

        userThread.setName("user_thread");
        daemonThread.setName("daemon_thread");

        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();

        try {
            userThread.join();
            daemonThread.join(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + " > ENDS");

    }
}

class UserThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " > is daemon: " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " > is daemon: " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
