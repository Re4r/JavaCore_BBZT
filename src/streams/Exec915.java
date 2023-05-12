package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exec915 {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("D:\\FileTest\\MFL");

        System.out.println("--------------------------------");

//        Files.createDirectory(directoryPath);

        Files.copy(filePath, directoryPath.resolve(filePath));

    }
}
