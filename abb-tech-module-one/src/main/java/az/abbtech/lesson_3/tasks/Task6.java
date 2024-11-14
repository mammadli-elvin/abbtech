package az.abbtech.lesson_3.tasks;

//TODO:
// + Write a Java program to reverse words in a given string.
//      Sample Output:
//      The given string is: Reverse words in a given string
//      The new string after reversed the words: string given a in words Reverse

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("The given string is: ");
        String str = new Scanner(System.in).nextLine();
        String[] arrStr = str.split(" ");
        for (int i=arrStr.length-1; i>=0; i--) {
            System.out.print(arrStr[i].concat(" "));
        }
    }
}
