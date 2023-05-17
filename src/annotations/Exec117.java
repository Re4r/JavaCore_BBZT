package annotations;

public class Exec117 {
}

@MyAnnotation
class EmployeeYZ {
    @MyAnnotation
    private String name;
    private double salary;

    @MyAnnotation
    public EmployeeYZ(String name, @MyAnnotation double salary) {
        this.name = name;
        this.salary = salary;
    }

    @MyAnnotation
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

@interface MyAnnotation {

}
