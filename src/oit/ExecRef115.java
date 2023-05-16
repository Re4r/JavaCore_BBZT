package oit;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
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

            Field [] fields1 = employeeClass.getDeclaredFields();
            for (Field field : fields1) {
                System.out.println(field);
            }
            System.out.println("--------------------------------------");

            Method method1 = employeeClass.getDeclaredMethod("changeDepartment", String.class);
            Method method2 = employeeClass.getMethod("increaseSalary");
            System.out.printf("%s : %s%n", method1.getReturnType(), Arrays.toString(method1.getParameterTypes()));
            System.out.printf("%s : %s%n", method2.getReturnType(), Arrays.toString(method2.getParameterTypes()));






        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }


    }
}
