package streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exec94 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("dest.txt"))) {



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
