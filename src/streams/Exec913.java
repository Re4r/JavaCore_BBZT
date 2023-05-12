package streams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Exec913 {
    public static void main(String[] args) {

        try (RandomAccessFile file = new RandomAccessFile("dest.txt", "r");
             FileChannel channel = file.getChannel()) {

            ByteBuffer buffer;
            buffer = ByteBuffer.allocate(Math.toIntExact(file.length()));

            channel.read(buffer);

            buffer.flip();

            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
