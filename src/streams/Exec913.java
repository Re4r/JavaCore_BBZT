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

//            ByteBuffer buffer;
//            buffer = ByteBuffer.allocate(Math.toIntExact(file.length()));
//
//            channel.read(buffer);
//
//            buffer.flip();
//
//            while (buffer.hasRemaining()) {
//                System.out.print((char) buffer.get());
//            }

            System.out.println("----------------------------");

            ByteBuffer buffer = ByteBuffer.allocate(10);
            channel.read(buffer);
            buffer.flip();
            for (int i = 0; i < 10; i++) {
                System.out.print((char) buffer.get());
            }
            System.out.println("----------------------------");
            buffer.rewind();
            for (int i = 0; i < 10; i++) {
                System.out.print((char) buffer.get());
            }
            System.out.println("----------------------------");
            buffer.compact();
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            System.out.println("----------------------------");
            buffer.clear();
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            System.out.println();
            System.out.println("----------------------------");
            buffer.mark();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            System.out.println();
            System.out.println("----------------------------");
            buffer.reset();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            System.out.println();
            System.out.println("----------------------------");






        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
