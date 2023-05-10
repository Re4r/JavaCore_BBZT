package streams;

import java.io.FileReader;
import java.io.IOException;

public class Exec92 {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("dest.txt")) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
