package streams.programmer1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {

        List<String> employees = new ArrayList<>();

        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader("dest.txt"))) {

            while (bufferedReader.ready()) {
                employees.add(bufferedReader.readLine());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        employees.forEach(System.out::println);
    }
}
