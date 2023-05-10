package streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exec92 {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("dest.txt")) {
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
