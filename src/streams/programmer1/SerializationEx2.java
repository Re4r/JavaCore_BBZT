package streams.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {

        Car car = new Car("V8", "Red");

        Employee employee = new Employee("Azwert", 38, 10500, "IT", car);

        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(new FileOutputStream("employee2.bin"))) {

            objectOutputStream.writeObject(employee);

            System.out.println(" >>> serialization complete");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
