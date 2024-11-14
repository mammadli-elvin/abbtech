package az.abbtech.lesson_3.tasks;

//TODO:
// + Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
//      Sample string: "The quick brown fox jumps over the lazy dog."
//      In the above string replace all the fox with cat.
//      Sample Output:
//      Original string: The quick brown fox jumps over the lazy dog.
//      New String: The quick brown cat jumps over the lazy dog.


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Input string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println("Input substring from string for replacement: ");
        String target = scanner.nextLine();

        System.out.println("Input new substring: ");
        String replacement = scanner.nextLine();

        String newStr = str.replaceAll(target, replacement);
        System.out.println("New string: " + newStr);

    }
}
