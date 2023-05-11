package streams;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Exec910 {
    public static void main(String[] args) throws IOException {

        File file = new File("dest.txt");
        File folder = new File("D:\\FileTest");
        File file2 = new File("D:\\FileTest\\dest3.txt");
        File folder2 = new File("D:\\FileTest\\B");
        File folder3 = new File("D:\\FileTest\\C");
        File file3 = new File("D:\\FileTest\\C\\dest4.txt");

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
        System.out.println(folder2.exists());
        System.out.println("------------------------");
        System.out.println(file2.createNewFile());
        System.out.println(folder2.mkdir());
        System.out.println("------------------------");
        System.out.println(file.length());
        System.out.println(folder.length());
        System.out.println("------------------------");
        System.out.println(file2.delete());
        System.out.println(folder2.delete());
        System.out.println("------------------------");
        folder3.mkdir();
        file3.createNewFile();
        new File("D:\\FileTest\\C\\dest5.txt").createNewFile();
        new File("D:\\FileTest\\C\\dest6.txt").createNewFile();
        File[] files = folder3.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("------------------------");




    }
}
