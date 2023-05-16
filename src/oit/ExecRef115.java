package oit;

public class ExecRef115 {
    public static void main(String[] args) {

        try {
            Class employeeClass = Class.forName("oit.Employee");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Class<Employee> employeeClass2 = Employee.class;

        Employee employee = new Employee();

        Class employeeClass3 = employee.getClass();

    }
}
