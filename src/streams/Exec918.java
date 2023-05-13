package streams;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Exec918 {
    public static void main(String[] args) {

        Path path = Paths.get("D:\\FileTest\\DEST");


        SimpleFileVisitor simpleFileVisitor = new SimpleFileVisitor() {
            @Override
            public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) throws IOException {
                return super.visitFile(file, attrs);
            }

            @Override
            public FileVisitResult postVisitDirectory(Object dir, IOException exc) throws IOException {
                return super.postVisitDirectory(dir, exc);
            }
        };

    }
}
