package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Exec1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee(100, "Fasert", "Looper", 400);
        Employee employee2 = new Employee(200, "Utrep", "Lirety", 300);
        Employee employee3 = new Employee(700, "Treyu", "Gertuo", 700);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);



    }
}

class Employee {
    private int id;
    private String name;
    private String surname;
    private int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
