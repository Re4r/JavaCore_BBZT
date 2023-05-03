package multithreading;

public class Exec82 {
    public static void main(String[] args) {

    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 1000; i < 0; i--) {
            System.out.println(i);
        }
    }
}