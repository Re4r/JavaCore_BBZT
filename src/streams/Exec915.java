package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Exec915 {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("test15.txt");
        Path filePath2 = Paths.get("D:\\FileTest\\MFL\\text16.txt");
        Path directoryPath = Paths.get("D:\\FileTest\\MFL");
        Path directoryPath2 = Paths.get("D:\\FileTest\\C");

        System.out.println("--------------------------------");

//        Files.createDirectory(directoryPath);

//        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(filePath, directoryPath.resolve("text16.txt"), StandardCopyOption.REPLACE_EXISTING);

        System.out.println("--------------------------------");

//        Files.copy(directoryPath2, directoryPath.resolve("B"));
//        Files.move(filePath, directoryPath2.resolve("test15.txt"));
//        Files.move(filePath2, directoryPath2.resolve("test17.txt"));


    }
}
