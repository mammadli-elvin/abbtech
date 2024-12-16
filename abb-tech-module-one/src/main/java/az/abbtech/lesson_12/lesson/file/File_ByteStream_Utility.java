package az.abbtech.lesson_12.lesson.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_ByteStream_Utility {
    public static byte[] readBytes(String filePath) {
        File file = new File(filePath);
        byte[] buffer = new byte[(int) file.length()];
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            fileInputStream.read(buffer);
            return buffer;
        } catch (IOException ioException) {
            throw new RuntimeException(ioException.getMessage());
        }
    }

    public static boolean writeBytes(String filePath, byte[] bytes) {
        File file = new File(filePath);
//        if (!file.exists()) {
//            try {
//                file.createNewFile();
//            } catch (IOException exception) {
//                throw new RuntimeException(exception);
//            }
//        }

        try(FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public static byte[] readBufferedBytes(String filePath) {
        File file = new File(filePath);
        byte[] buffer = new byte[(int) file.length()];
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file))) {
            int content, index = 0;
            while ((content = bufferedInputStream.read()) != -1) {
                buffer[index++] = (byte) content;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return buffer;
    }

    public static boolean writeBufferedBytes(String filePath, byte[] bytes) {
        File file = new File(filePath);
//        if (!file.exists()) {
//            try {
//                file.createNewFile();
//            } catch (IOException exception) {
//                throw new RuntimeException(exception);
//            }
//        }

        try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file))) {
            bufferedOutputStream.write(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
