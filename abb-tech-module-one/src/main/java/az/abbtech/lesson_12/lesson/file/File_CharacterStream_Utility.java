package az.abbtech.lesson_12.lesson.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_CharacterStream_Utility {
    public static String readTextFromFile(String filePath) {
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                stringBuilder.append(line);
                line = br.readLine();
            }
            return stringBuilder.toString();
        }  catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    private static void writeTextIntoFile(String filePath, String content, boolean append) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, append))) {
            bw.write(content);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static boolean writeTextIntoFile(String filePath, String content) {
        writeTextIntoFile(filePath, content, false);
        return true;
    }

    public static boolean appendTextIntoFile(String filePath, String content) throws IOException {
        writeTextIntoFile(filePath, content, true);
        return true;
    }
}
