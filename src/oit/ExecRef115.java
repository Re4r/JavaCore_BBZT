package oit;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
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
            System.out.println("--------------------------------------");

            Method [] methods = employeeClass.getDeclaredMethods();
            Method [] methods1 = employeeClass.getMethods();

            for (Method method : methods) {
                System.out.println(method);
            }
            System.out.println("--------------------------------------");

            for (Method method : methods1) {
                System.out.println(method);
            }
            System.out.println("--------------------------------------");

            Method [] methods2 = employeeClass.getDeclaredMethods();

            for (Method method : methods2) {
                if (Modifier.isPrivate(method.getModifiers())) {
                    System.out.println(method);
                }
            }
            System.out.println("--------------------------------------");

            Constructor<Employee> constructor =
                    employeeClass.getConstructor(int.class, String.class, String.class, double.class);
            System.out.println(constructor + " : " + Arrays.toString(constructor.getParameterTypes()));
            System.out.println("--------------------------------------");

            Constructor<?>[] constructors = employeeClass.getConstructors();
            for (Constructor<?> constr : constructors) {
                System.out.println(constr + " : " + constr.getParameterCount());
            }
            System.out.println("--------------------------------------");

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }
}
