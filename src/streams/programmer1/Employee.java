package streams.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int age;
    private double salary;
    private String department;

    public Employee(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employees{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append(", department='").append(department).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
