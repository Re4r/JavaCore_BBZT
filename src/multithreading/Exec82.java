package multithreading;

public class Exec82 {
    public static void main(String[] args) {

        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();

        thread1.start();
        thread2.start();

    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 20; i > 0; i--) {
            System.out.println(i);
        }
    }
}