package annotations;

public class Exec117 {
}

class EmployeeYZ {
    private String name;
    private double salary;

    public EmployeeYZ(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary() {
        salary *= 2;
    }

    @Override
    public String toString() {
        return "EmployeeYZ{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
