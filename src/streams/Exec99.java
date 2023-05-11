package streams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exec99 {
    public static void main(String[] args) {

        try (RandomAccessFile randomAccessFile =
                     new RandomAccessFile("dest.txt", "rw")) {

            String s = randomAccessFile.readLine();
            System.out.println(s);
            System.out.println("-----------------------");
            System.out.println(randomAccessFile.length() + " - byte");
            randomAccessFile.seek(100);
            String s2 = randomAccessFile.readLine();
            System.out.println(s2);
            System.out.println("-----------------------");
            System.out.println(randomAccessFile.getFilePointer());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
