package streams.programmer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx2 {
    public static void main(String[] args) {

        List<String> employees2;

        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(new FileInputStream("employees1.bin"))) {

            employees2 = (ArrayList) objectInputStream.readObject();

            employees2.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
