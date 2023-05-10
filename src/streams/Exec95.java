package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exec95 {
    public static void main(String[] args) {

        try (FileInputStream fileInputStream =
                     new FileInputStream("C:\\Users\\re4r\\OneDrive\\Рабочий стол\\TEMP\\testpict.jpg");
             FileOutputStream fileOutputStream =
                     new FileOutputStream("destpict.jpg")) {




        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
