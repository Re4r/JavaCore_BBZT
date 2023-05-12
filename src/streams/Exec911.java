package streams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Exec911 {
    public static void main(String[] args) {

        try (RandomAccessFile file = new RandomAccessFile("dest.txt", "rw")) {
            try (FileChannel channel = file.getChannel()) {

                ByteBuffer buffer = ByteBuffer.allocate(10);

                StringBuilder heroes = new StringBuilder();

                int byteRead = channel.read(buffer);
                while (byteRead > 0) {

                    System.out.println("Read > " + byteRead);

                    buffer.flip();

                    while (buffer.hasRemaining()) {
                        heroes.append((char) buffer.get());
                    }

                    buffer.clear();

                    byteRead = channel.read(buffer);
                }

                System.out.println(heroes);

                String text = "\nAAAAAAAAAA" + "\nXXXXXXXXXX";

                ByteBuffer buffer1 = ByteBuffer.allocate(text.getBytes().length);



            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
