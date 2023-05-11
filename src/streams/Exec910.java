package streams;

import java.io.File;

public class Exec910 {
    public static void main(String[] args) {

        File file = new File("dest.txt");
        File folder = new File("D:\\FileTest");
        File file2 = new File("D:\\FileTest\\dest3.txt");

        System.out.println("------------------------");
        System.out.println(file.getAbsolutePath());
        System.out.println(file2.getAbsolutePath());
        System.out.println("------------------------");
        System.out.println(folder.getAbsolutePath());
        System.out.println("------------------------");
        System.out.println(file.isAbsolute());
        System.out.println(folder.isAbsolute());
        System.out.println("------------------------");
        System.out.println(file.isDirectory());
        System.out.println(folder.isDirectory());
        System.out.println("------------------------");
        System.out.println(file.exists());
        System.out.println(file2.exists());
        System.out.println(folder.exists());
        System.out.println("------------------------");

    }
}
