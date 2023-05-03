package multithreading;

public class Exec82 {
    public static void main(String[] args) {

        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        Thread thread3 = new Thread(new MyThread3());
        Thread thread4 = new Thread(new MyThread4());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
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

class MyThread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable {
    @Override
    public void run() {
        for (int i = 20; i >= 0; i--) {
            System.out.println(i);
        }
    }
}