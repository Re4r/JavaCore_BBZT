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

                ByteBuffer buffer = ByteBuffer.allocate(25);
                StringBuilder heroes = new StringBuilder();

                int byteRead = channel.read(buffer);
                while (byteRead > 0) {
                    System.out.println("Read > " + byteRead);
                    buffer.flip();
                }


            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
