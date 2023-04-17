package lesson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exec1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee(500, "Fasert", "Looper", 400);
        Employee employee2 = new Employee(200, "Utrep", "Lirety", 300);
        Employee employee3 = new Employee(700, "Treyu", "Gertuo", 700);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        System.out.println(employees);
        employees.sort(new IdComparator());
        System.out.println(employees);
        employees.sort(new NameComparator());
        System.out.println(employees);
        employees.sort(new SurnameComparator());
        System.out.println(employees);
        employees.sort(new SalaryComparator());
        System.out.println(employees);
    }
}

//Comparable<Employee>
class Employee {
    private final int id;
    private final String name;
    private final String surname;
    private final int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
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

//    @Override
//    public int compareTo(Employee employee) {
////        return Integer.compare(this.id, employee.id);
//        int res = this.name.compareTo(employee.name);
//        if (res == 0) {
//            res = this.surname.compareTo(employee.surname);
//        }
//        return res;
//    }
}

class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.getId() != emp2.getId()) {
            if (emp1.getId() < emp2.getId()) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }
}
class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getName().compareTo(emp2.getName());
    }
}
class SurnameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getSurname().compareTo(emp2.getSurname());
    }
}
class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return Integer.compare(emp1.getSalary(), emp2.getSalary());
    }
}
