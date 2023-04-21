package lesson4;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exec49 {
    public static void main(String[] args) {

//        ArrayList<Integer> integers = new ArrayList<>();
//
//        Random random = new Random();
//
//        for (int i = 0; i < 30; i++) {
//            integers.add(random.nextInt(100));
//        }
//
//        System.out.println(integers);
//        System.out.println("---------------------");
//
//        Collections.sort(integers);
//
//        System.out.println(integers);
//        System.out.println("---------------------");
//
//        int index = Collections.binarySearch(integers, 33);
//
//        System.out.println(index);
//        System.out.println("---------------------");

        List<Employee> employeeList = new ArrayList<>();

        Random random1 = new Random();

        for (int i = 0; i < 10; i++) {
            employeeList.add(new Employee(random1.nextInt(100)
                    , Integer.toString(random1.nextInt(100000))
                    , random1.nextInt(10000)));
        }

        show(employeeList);
        System.out.println("-----------------------------------------------");

        Collections.sort(employeeList);
        show(employeeList);
        System.out.println("-----------------------------------------------");


        int index = Integer.MIN_VALUE;
        while (index < 0) {
            index = Collections.binarySearch(employeeList,
                    new Employee(random1.nextInt(100),
                            Integer.toString(random1.nextInt(100000)),
                            random1.nextInt(10000)));
        }
        System.out.println(index);
        System.out.println(employeeList.get(index));
    }

    public static <T> void show(List<T> list) {
        for (T e : list) {
            System.out.println(e);
        }
    }
}

class Employee implements Comparable<Employee> {
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
        return "Employee > " +
                "Id: " + id +
                ", Name: '" + name + '\'' +
                ", Salary: " + salary;
    }

    @Override
    public int compareTo(@NotNull Employee o) {
        int result = Integer.compare(this.id, o.id);
        if (result == 0) {
            result = this.name.compareTo(o.name);
        } else if (result == 0) {
            result = Integer.compare(this.salary, o.salary);
        }
        return result;
    }
}
