package multithreading;

public class Exec82 {
    public static void main(String[] args) {

//        MyThread1 thread1 = new MyThread1();
//        MyThread2 thread2 = new MyThread2();

//        Thread thread3 = new Thread(new MyThread3());
//        Thread thread4 = new Thread(new MyThread4());
//
//        thread1.start();
//        thread2.start();

//        thread3.start();
//        thread4.start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 20; i++) {
//                    System.out.println(i);
//                }
//            }
//        }).start();
//
//        new Thread((new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 20; i > 0; i--) {
//                    System.out.println(i);
//                }
//            }
//        })).start();

        Thread thread5 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println(i);
            }
        });

        Thread thread6 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 50; i > 0; i--) {
                    System.out.println(i);
                }
            }
        });

        thread5.start();
        thread6.start();
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }
    }
}

class MyThread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 100; i < 200; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable {
    @Override
    public void run() {
        for (int i = 200; i > 100; i--) {
            System.out.println(i);
        }
    }
}