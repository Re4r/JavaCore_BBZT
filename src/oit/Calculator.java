package oit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Calculator {

    void calc(int x, int y) {
        System.out.println(" + : " + (x + y));
        System.out.println(" - : " + (x - y));
        System.out.println(" * : " + (x * y));
        System.out.println(" / : " + (x / y));
    }
}

class TestCalculator {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("dest.txt"))) {

            String methodName = bufferedReader.readLine();
            String firstArg = bufferedReader.readLine();
            String secondArg = bufferedReader.readLine();

            Calculator calculator = new Calculator();

            Class<Calculator> calculatorClass = Calculator.class;

            Method method = null;

            Method[] methods = calculatorClass.getDeclaredMethods();
            System.out.println(Arrays.toString(methods));

            for (Method myMethod : methods) {
                if (myMethod.getName().equals(methodName)) {
                    method = myMethod;
                }
            }

            method.invoke(calculator, Integer.parseInt(firstArg), Integer.parseInt(secondArg));


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
