package streams;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exec96 {
    public static void main(String[] args) {

        try (DataOutputStream dataOutputStream =
                     new DataOutputStream(new FileOutputStream("my_test.bin"))) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
