package az.abbtech.lesson_12.lesson.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class File_ObjectDeserialize_Utility {

    public static Object readObject(String fileName) {
        Object object = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            object = objectInputStream.readObject();
            return object;
        } catch (IOException | ClassNotFoundException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static void writeObject(String fileName, Object object) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(object);
            System.out.println("Object written to file successfully.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
