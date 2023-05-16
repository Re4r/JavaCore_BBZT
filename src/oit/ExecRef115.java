package oit;

import java.lang.reflect.Field;
import java.util.Arrays;

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
            System.out.println("--------------------------------------");

            Field [] fields = employeeClass.getFields();
            for (Field field : fields) {
                System.out.println(field);
            }
            System.out.println("--------------------------------------");






        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }


    }
}
