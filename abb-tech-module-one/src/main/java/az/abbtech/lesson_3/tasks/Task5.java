package az.abbtech.lesson_3.tasks;

//TODO:
// + Write a Java program to divide a string into n equal parts.
//      Sample Output:
//      The given string is: abcdefghijklmnopqrstuvwxy
//      The string divided into 5 parts and they are:
//      abcde
//      fghij
//      klmno
//      pqrst
//      uvwxy

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        String str = new Scanner(System.in).nextLine();
        System.out.println("How many equals_tostring_hashcode parts do you want to divide string: ");
        int n = new Scanner(System.in).nextInt();

        int length = str.length() / n;
        for (int i = 0; i < n; i++) {
            System.out.println(str.substring(length * i, length * i + length));
        }
    }
}
