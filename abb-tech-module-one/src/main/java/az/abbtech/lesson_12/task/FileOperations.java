package az.abbtech.lesson_12.task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Collectors;

public final class FileOperations {
    public static void readFromFile(File file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String content = bufferedReader.lines().collect(Collectors.joining("\n"));
            if (content.isEmpty()) {
                System.out.println("File is empty");
            } else {
                System.out.println(content);
            }
        } catch (FileNotFoundException exception) {
            System.err.println("Error! File not found: " + file.getAbsolutePath());
        } catch (IOException exception) {
            System.err.println("Error reading the file." + file.getAbsolutePath());
        }
    }

    private static boolean writeToFile(File file, String text, boolean append) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, append))) {
            bufferedWriter.write(text);
            System.out.println("Operation successful.");
            return true;
        } catch (IOException exception) {
            System.err.println("Error writing the file." + file.getAbsolutePath());
            return false;
        }
    }

    public static boolean overwriteFile(File file, String text) {
        return writeToFile(file, text, false);
    }

    public static boolean appendToFile(File file, String text) {
        return writeToFile(file, text, true);
    }
}
