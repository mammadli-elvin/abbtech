package az.abbtech.lesson_12.task;

import java.io.File;
import java.util.Scanner;

public class Main {
    private static final File FILE = new File("src\\main\\java\\az\\abbtech\\lesson_12\\task\\student.txt");    // Setting relative path for encrypting user hierarchy

    public static void main(String[] args) {
        System.out.println("Hello User!");

        while (true) {
            printMenu();
            int option = getUserChoice();
            processOption(option);
        }
    }

    private static void printMenu() {
        System.out.print("""
                Menu:
                    1. View all records
                    2. Overwrite file with new records
                    3. Append a new record
                    4. Exit
                """);
    }

    private static int getUserChoice() {
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Enter a valid choice: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void processOption(int option) {
        switch (option) {
            case 1 -> FileOperations.readFromFile(FILE);
            case 2 -> FileOperations.overwriteFile(FILE, Student.getStudentForm());
            case 3 -> FileOperations.appendToFile(FILE, Student.getStudentForm());
            case 4 -> {
                if (confirmExit()) {
                    System.out.println("GoodBye!");
                    System.exit(0);
                }
            }
            default -> System.out.println("Invalid choice! Please try again.");
        }
    }

    private static boolean confirmExit() {
        System.out.println("Are you sure you want to exit? (y/n): ");
        String answer = new Scanner(System.in).nextLine();
        return answer.equalsIgnoreCase("y");
    }
}
