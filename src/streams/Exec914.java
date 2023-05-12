package streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exec914 {
    public static void main(String[] args) {

        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("D:\\FileTest\\M");
        Path anotherPath = Paths.get("D:\\FileTest\\M\\N\\O\\P\\test20.txt");

        // Interface Path

//        System.out.println("-------------------------------");
//        System.out.println(filePath.getFileName());
//        System.out.println(directoryPath.getFileName());
//        System.out.println("-------------------------------");
//        System.out.println(filePath.getParent());
//        System.out.println(directoryPath.getParent());
//        System.out.println("-------------------------------");
//        System.out.println(filePath.getRoot());
//        System.out.println(directoryPath.getRoot());
//        System.out.println("-------------------------------");
//        System.out.println(filePath.isAbsolute());
//        System.out.println(directoryPath.isAbsolute());
//        System.out.println("-------------------------------");
//        System.out.println(filePath.toAbsolutePath());
//        System.out.println(directoryPath.toAbsolutePath());
//        System.out.println("-------------------------------");
//        System.out.println(filePath.toAbsolutePath().getParent());
//        System.out.println(filePath.toAbsolutePath().getRoot());
//        System.out.println("-------------------------------");
//        System.out.println(directoryPath.resolve(filePath));
//        System.out.println("-------------------------------");
//        System.out.println(directoryPath.relativize(anotherPath));
//        System.out.println("-------------------------------");

        // Class Files

        if (!Files.exists(filePath)) {
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (Files.exists(directoryPath)) {
            try {
                Files.createDirectory(directoryPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("-------------------------------");
        System.out.println(Files.isReadable(filePath));
        System.out.println(Files.isReadable(filePath));
        System.out.println(Files.isExecutable(filePath));
        System.out.println("-------------------------------");
        Path filePath2 = Paths.get("C:\\JavaRush\\JavaCore\\JCBBZT\\test15.txt");
        try {
            System.out.println(Files.isSameFile(filePath, filePath2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-------------------------------");
        try {
            System.out.println(Files.size(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-------------------------------");



    }
}
