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
        thread1.setPriority(3);
        thread2.setName("threadTwo");
        thread2.setPriority(7);
        thread3.setName("threadThree");
        thread3.setPriority(10);

        System.out.println(thread1.getName() + " : " + thread1.getPriority());
        System.out.println(thread2.getName() + " : " + thread2.getPriority());
        System.out.println(thread3.getName() + " : " + thread3.getPriority());
        System.out.println("-----------------------------------------------");

        thread1.start();
        thread2.start();
        thread3.start();



    }
}
