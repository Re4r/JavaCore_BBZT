package streams.programmer2;

import streams.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx3 {
    public static void main(String[] args) {

        Employee employee;

        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(new FileInputStream("employee2.bin"))) {

            employee = (Employee) objectInputStream.readObject();

            System.out.println(employee);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
