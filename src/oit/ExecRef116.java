package oit;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExecRef116 {

    public static void main(String[] args) {

        Class<Employee> employeeClass = Employee.class;

        try {
            Constructor<Employee> constructor = employeeClass.getConstructor();
            Constructor<Employee> constructor1 = employeeClass.getConstructor(int.class, String.class, String.class);

            Employee employee = constructor.newInstance();
            Employee employee1 = constructor1.newInstance(5, "Averty", "IT");

            System.out.println(employee1);

            Method method = employeeClass.getMethod("setSalary", double.class);

            method.invoke(employee1, 1800);

            System.out.println(employee1);




        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }




}
