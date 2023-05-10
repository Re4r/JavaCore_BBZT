package streams;

import java.io.*;

public class Exec95 {
    public static void main(String[] args) {

//        try (FileInputStream fileInputStream =
//                     new FileInputStream("C:\\Users\\re4r\\OneDrive\\Рабочий стол\\TEMP\\testpict.jpg");
//             FileOutputStream fileOutputStream =
//                     new FileOutputStream("destpict.jpeg")) {
//            int i;
//            while ((i = fileInputStream.read()) != -1) {
//                fileOutputStream.write(i);
//            }
//
//            System.out.println(" >>> complete");
//
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try (BufferedInputStream bufferedInputStream =
                     new BufferedInputStream(new FileInputStream
                             ("C:\\Users\\re4r\\OneDrive\\Рабочий стол\\TEMP\\testpict.jpg"));
             BufferedOutputStream bufferedOutputStream =
                     new BufferedOutputStream(new FileOutputStream("destpict2.jpg"))) {
            int x;
            while ((x = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(x);
            }

            System.out.println(" >>> completed");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
