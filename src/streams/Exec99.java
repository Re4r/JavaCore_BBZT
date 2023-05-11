package streams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exec99 {
    public static void main(String[] args) {

        try (RandomAccessFile randomAccessFile =
                     new RandomAccessFile("dest.txt", "rw")) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
