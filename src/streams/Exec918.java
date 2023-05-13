package streams;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Exec918 {
    public static void main(String[] args) {

        Path path = Paths.get("D:\\FileTest\\DEST");


        SimpleFileVisitor<Path> simpleFileVisitor = new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println("Delete file >>> " + file.getFileName());
                Files.delete(file);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                System.out.println("Delete directory >>> " + dir.getFileName());
                Files.delete(dir);
                return FileVisitResult.CONTINUE;
            }
        };

    }
}
