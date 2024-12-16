package az.abbtech.lesson_12.lesson.file;

import az.abbtech.lesson_12.example.Room;

import java.io.File;
import java.io.IOException;

public class FileOperationMain {

    public static void main(String[] args) {
        String inputFilePath = "D:\\Elvin Mammadli\\Workspace\\java\\Intellij Projects\\abbtech\\abb-tech-module-one\\src\\main\\java\\az\\abbtech\\lesson_12\\example\\photo.png";
        String outputFilePath = "D:\\Elvin Mammadli\\Workspace\\java\\Intellij Projects\\abbtech\\abb-tech-module-one\\src\\main\\java\\az\\abbtech\\lesson_12\\example\\result.png";
        String inputTextFilePath = "D:\\Elvin Mammadli\\Workspace\\java\\Intellij Projects\\abbtech\\abb-tech-module-one\\src\\main\\java\\az\\abbtech\\lesson_12\\example\\sample.txt";
        String outputTextFilePath = "D:\\Elvin Mammadli\\Workspace\\java\\Intellij Projects\\abbtech\\abb-tech-module-one\\src\\main\\java\\az\\abbtech\\lesson_12\\example\\result.txt";
        String serializeObjectFilePath = "D:\\Elvin Mammadli\\Workspace\\java\\Intellij Projects\\abbtech\\abb-tech-module-one\\src\\main\\java\\az\\abbtech\\lesson_12\\example\\room.ser";

        // File_ByteStream
//        byte[] buffer = File_ByteStream_Utility.readBytes(inputFilePath);
//        byte[] buffer2 = File_ByteStream_Utility.readBufferedBytes(inputFilePath);
//        System.out.println(File_ByteStream_Utility.writeBytes(outputFilePath, buffer));
//        System.out.println(File_ByteStream_Utility.writeBufferedBytes(outputFilePath, buffer2));

        // File_CharacterStream
//        String sample = File_CharacterStream_Utility.readTextFromFile(inputTextFilePath);
//        System.out.println(File_CharacterStream_Utility.writeTextIntoFile(outputTextFilePath, sample));

        // File_ObjectDeserialize
//        Room room = new Room("Innovation", 30, 10, "Sample room");
//        File_ObjectDeserialize_Utility.writeObject(serializeObjectFilePath, room);
//        Room deserializeStudent = (Room) File_ObjectDeserialize_Utility.readObject(serializeObjectFilePath);
//        System.out.println(deserializeStudent.toString());

        // File_NIO
        byte[] data = File_NIO_Utility.readBytesNio(inputFilePath);
        File_NIO_Utility.writeBytesNio(data, outputFilePath);

    }
}
