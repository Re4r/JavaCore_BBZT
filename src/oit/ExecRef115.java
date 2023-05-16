package oit;

import java.lang.reflect.Field;

public class ExecRef115 {
    public static void main(String[] args) {

//        try {
//            Class employeeClass = Class.forName("oit.Employee");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        Employee employee = new Employee();
//
//        Class employeeClass3 = employee.getClass();

        Class<Employee> employeeClass = Employee.class;

        try {
            Field fieldId = employeeClass.getField("id");
            System.out.println("Type of filed id: " + fieldId.getType());
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }


    }
}
