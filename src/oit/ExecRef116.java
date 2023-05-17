package oit;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ExecRef116 {

    public static void main(String[] args) {

        Class<Employee> employeeClass = Employee.class;

        try {
            Constructor<Employee> constructor = employeeClass.getConstructor();
            Constructor<Employee> constructor1 = employeeClass.getConstructor(int.class, String.class, String.class);
            Employee employee = constructor.newInstance();
            Employee employee1 = constructor1.newInstance();
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
