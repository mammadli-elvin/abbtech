package az.abbtech.lesson_12.task;

import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;

public class Student {
    private final int id;
    private final String name;
    private final double score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public static String getStudentForm() {
        int id = validateInput("Enter student ID (positive integer): ", input -> input > 0, "Invalid ID. ID must be positive.");
        String name = validateName();
        double score = validateInput("Enter student score (0-100): ", input -> (input >= 0 && input <= 100), "Invalid score. Must be between 0 and 100.");
        return new Student(id, name, score).toString();
    }

    private static int validateInput(String prompt, Predicate<Integer> validator, String errorMsg) {
        System.out.print(prompt);
        return Optional.of(new Scanner(System.in).nextInt())
                .filter(validator)
                .orElseThrow(() -> new IllegalArgumentException(errorMsg));
    }

    private static String validateName() {
        System.out.print("Enter student name: ");
        return Optional.of(new Scanner(System.in).nextLine().trim())
                .filter(input -> !input.isEmpty())
                .orElse("UNKNOWN");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "StudentID: " + id + ", Name: " + name + ", Score: " + score + "\n";
    }
}
