package streams.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int age;
    transient private double salary;
    private String department;
    private Car car;

    public Employee(String name, int age, double salary, String department, Car car) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.car = car;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append(", department='").append(department).append('\'');
        sb.append(", car=").append(car);
        sb.append('}');
        return sb.toString();
    }
}
