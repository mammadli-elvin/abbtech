package az.abbtech.lesson_12.lesson.file;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class File_NIO_Utility {
    public static byte[] readBytesNio(String fileName) {
        Path filePath = Paths.get(fileName);
        try {
            byte[] buffer = Files.readAllBytes(filePath);
            return buffer;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeBytesNio(byte[] data, String fileName) {
        Path filePath = Paths.get(fileName);
        try {
            Files.write(filePath, data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     *  Advance NIO methods for working with Files
     */
// Reading bytes from a file with FileChannel (supports large files)
//    public static byte[] readBytesNioPro(String fileName) {
//        Path filePath = Paths.get(fileName);
//        try (FileChannel fileChannel = FileChannel.open(filePath, StandardOpenOption.READ)) {
//            ByteBuffer buffer = ByteBuffer.allocate((int) fileChannel.size());
//            fileChannel.read(buffer);
//            return buffer.array();
//        } catch (IOException e) {
//            throw new RuntimeException("Error reading file: " + fileName, e);
//        }
//    }

    // Writing bytes to a file with FileChannel
//    public static void writeBytesNioPro(byte[] data, String fileName) {
//        Path filePath = Paths.get(fileName);
//        try (FileChannel fileChannel = FileChannel.open(filePath,
//                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
//            ByteBuffer buffer = ByteBuffer.wrap(data);
//            fileChannel.write(buffer);
//        } catch (IOException e) {
//            throw new RuntimeException("Error writing file: " + fileName, e);
//        }
//    }
}
