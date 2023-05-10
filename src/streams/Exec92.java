package streams;

import java.io.FileReader;
import java.io.IOException;

public class Exec92 {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("dest.txt")) {

            int character;
            while((character = fileReader.read()) != -1) {
                System.out.println((char) character);
            }
            System.out.println("------------------");
            System.out.println("Operation Complete");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
