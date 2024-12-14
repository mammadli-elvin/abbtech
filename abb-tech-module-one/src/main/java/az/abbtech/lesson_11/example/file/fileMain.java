package az.abbtech.lesson_11.example.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileMain {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\Elvin Mammadli\\Workspace\\java\\Intellij Projects\\abbtech\\abb-tech-module-one\\src\\main\\java\\az\\abbtech\\lesson_11\\example\\file\\photo.png");
        try(FileInputStream fileInputStream = new FileInputStream(file)) {
            int content;
            while((content = fileInputStream.read()) != -1) {
                System.out.println((char) content);
            };
        } catch(Exception exception) {
            throw new RuntimeException(exception);
        }

        File file2 = new File("D:\\Elvin Mammadli\\Workspace\\java\\Intellij Projects\\abbtech\\abb-tech-module-one\\src\\main\\java\\az\\abbtech\\lesson_11\\example\\file\\copy.png");
        try(FileOutputStream fileOutputStream = new FileOutputStream(file)) {
//            fileOutputStream


        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}
