package streams;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Exec916 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("D:\\FileTest\\MFL");

//        Files.createDirectory(Path.of("D:\\FileTest\\MFL\\V"));
//        Files.createDirectory(Path.of("D:\\FileTest\\MFL\\K"));
//        Files.createDirectory(Path.of("D:\\FileTest\\MFL\\RT"));

        FileVisitor<Path> pathFileVisitor = new FileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                System.out.println("Enter to directory >>> " + dir);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println("File name >>> " + file.getFileName());
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                System.out.println("Error while visiting file >>> " + file.getFileName());
                return FileVisitResult.TERMINATE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                System.out.println("Exit from directory >>> " + dir);
                return FileVisitResult.CONTINUE;
            }
        };

        Files.walkFileTree(path, pathFileVisitor);


    }
}
