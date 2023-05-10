package streams;

import java.io.*;

public class Exec96 {
    public static void main(String[] args) {

        try (DataOutputStream dataOutputStream =
                     new DataOutputStream(new FileOutputStream("my_test.bin"));
             DataInputStream dataInputStream =
                     new DataInputStream(new FileInputStream("my_test.bin"))) {

            for (int i = 0; i < 10; i++) {
//                dataOutputStream.writeBoolean(true);
//                dataOutputStream.writeByte(i);
//                dataOutputStream.writeChar(i);
                dataOutputStream.writeDouble(i);
//                dataOutputStream.writeFloat(i);
//                dataOutputStream.writeInt(i);
//                dataOutputStream.writeShort(i);
//                dataOutputStream.writeLong(i);
            }

//            while (dataInputStream.read() != -1) {
////                System.out.println(dataInputStream.readInt());
//                System.out.println(dataInputStream.readDouble());
//            }

//            System.out.println(dataInputStream.readInt());
//            System.out.println(dataInputStream.readInt());
//            System.out.println(dataInputStream.readInt());
//            System.out.println(dataInputStream.readDouble());
//            System.out.println(dataInputStream.readDouble());
//            System.out.println(dataInputStream.readDouble());

            for (int i = 0; i < 10; i++) {
                System.out.println(dataInputStream.readDouble());
            }

            System.out.println(" >>> completed");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
