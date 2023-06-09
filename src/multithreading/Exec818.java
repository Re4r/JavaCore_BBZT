package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Exec818 {

    private static Semaphore phoneBox = new Semaphore(2);
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            personList.add(new Person(phoneBox));
        }

        personList.forEach(Person::start);

    }
}

class Person extends Thread {
    private Semaphore phoneBox;

    public Person(Semaphore phoneBox) {
        this.phoneBox = phoneBox;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " Waiting...");
            phoneBox.acquire();
            System.out.println(Thread.currentThread().getName() + " Using device...");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Finished...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            phoneBox.release();
        }
    }
}