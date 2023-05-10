package streams;

import java.io.*;

public class Exec94 {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("dest.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("dest2.txt"))) {

                bufferedWriter.write(bufferedReader.read());

            System.out.println(" >>> Operation Complete");



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
