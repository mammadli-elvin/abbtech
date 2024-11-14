package az.abbtech.lesson_3.tasks;

//TODO:
// + Write a Java program to find the maximum and minimum value of an array.

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < length; i++) {
            arr[i] = (scanner.nextInt());
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum element is: " + min);
        System.out.println("Maximum element is: " + max);
    }
}
