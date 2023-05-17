package oit;

import java.lang.reflect.Field;

public class ExecRef1162 {
    public static void main(String[] args) {

        Employee employee = new Employee(17, "Gertyup", "IT");

        Class<Employee> employeeClass = Employee.class;

        try {
            Field field = employeeClass.getDeclaredField("salary");

            field.setAccessible(true);

            double salaryValue = field.getDouble(employee);

            System.out.println(salaryValue);


        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
