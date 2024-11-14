package az.abbtech.lesson_3.tasks;

//TODO:
// + Write a Java program to print the result of removing duplicates from a given string.
//      Sample Output:
//      The given string is: w3resource
//      After removing duplicates characters the new string is: w3resouce

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (i!=j && str.charAt(i) == str.charAt(j)) {
                    break;
                }
                if (j == str.length()-1) {
                    strBuilder.append(str.charAt(i));
                }
            }

        }
        System.out.println(strBuilder.toString());

    }

}
