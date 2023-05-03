package multithreading;

public class Exec83 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread1");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread2");
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread3");
            }
        });
        System.out.println("-----------------------------------------------");
        System.out.println(thread1.getName() + " : " + thread1.getPriority());
        System.out.println(thread2.getName() + " : " + thread2.getPriority());
        System.out.println(thread3.getName() + " : " + thread3.getPriority());
        System.out.println("-----------------------------------------------");

        thread1.setName("threadOne");
        thread1.setPriority(Thread.NORM_PRIORITY);
        thread2.setName("threadTwo");
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread3.setName("threadThree");
        thread3.setPriority(Thread.MAX_PRIORITY);

        System.out.println(thread1.getName() + " : " + thread1.getPriority());
        System.out.println(thread2.getName() + " : " + thread2.getPriority());
        System.out.println(thread3.getName() + " : " + thread3.getPriority());
        System.out.println("-----------------------------------------------");

        thread1.start();
        thread2.start();
        thread3.start();

        Examp examp = new Examp();
        Examp examp1 = new Examp();
        Examp examp2 = new Examp();

        examp.start();
        examp1.start();
        examp2.start();

        System.out.println("-----------------------------------------------");

    }
}

class Examp extends Thread {
    @Override
    public void run() {
        System.out.println(new StringBuilder()
                .append("Method Run: Thread Name: ")
                .append(Thread.currentThread().getName())
                .toString());
    }
}
