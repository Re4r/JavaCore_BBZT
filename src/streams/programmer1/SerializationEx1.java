package streams.programmer1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {

        List<String> employees = new ArrayList<>();

        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader("dest.txt"));
             ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(new FileOutputStream("employees1.bin"))) {

            while (bufferedReader.ready()) {
                employees.add(bufferedReader.readLine());
            }

            objectOutputStream.writeObject(employees);

            System.out.println(" >>> Operetion Complete");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        employees.forEach(System.out::println);
    }
}
