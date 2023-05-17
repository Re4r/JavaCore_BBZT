package oit;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ExecRef116 {

    Class<Employee> employeeClass = Employee.class;

    Constructor<Employee> employeeConstructor;

    {
        try {
            employeeConstructor = employeeClass.getConstructor();
            Employee employee = employeeConstructor.newInstance();
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
