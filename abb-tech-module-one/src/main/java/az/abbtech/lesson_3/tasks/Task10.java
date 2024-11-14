package az.abbtech.lesson_3.tasks;

//TODO:
// - Write a program to count the occurrences of a specific value in an array.

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < length; i++) {
            arr[i] = (scanner.nextInt());
        }
        System.out.println("Enter specific value for counting: ");
        int value = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == value) {
                count++;
            }
        }
        System.out.println("Number of this specific value in array: " + count);
    }
}
