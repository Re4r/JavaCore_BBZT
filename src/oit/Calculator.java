package oit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {

    void calc(int x, int y) {
        System.out.println(" + " + (x + y));
        System.out.println(" - " + (x - y));
        System.out.println(" * " + (x * y));
        System.out.println(" / " + (x / y));
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

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
