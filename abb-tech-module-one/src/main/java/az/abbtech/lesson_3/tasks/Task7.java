package az.abbtech.lesson_3.tasks;

//TODO:
// + Write a Java program to return the sum of the digits present in the given string. In the absence of digits, the sum is 0.
//      Sample Output:
//      The given string is: ab5c2d4ef12s
//      The sum of the digits in the string is: 14

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("The given string is: ");
        String str = new Scanner(System.in).nextLine();
        double sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char[] chars = str.toCharArray();
            if(Character.isDigit(chars[i])) {
                sum += Integer.parseInt(String.valueOf(chars[i]));
            };
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
