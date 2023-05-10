package streams;

import java.io.*;

public class Exec94 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("dest.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("dest2.txt"))) {





        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
