package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exec49 {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            integers.add(random.nextInt(100));
        }

        System.out.println(integers);
        System.out.println("---------------------");

        Collections.sort(integers);

        System.out.println(integers);
        System.out.println("---------------------");

        int index = Collections.binarySearch(integers, 33);

        System.out.println(index);
        System.out.println("---------------------");
    }
}

class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee >" +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", salary: " + salary;
    }
}
