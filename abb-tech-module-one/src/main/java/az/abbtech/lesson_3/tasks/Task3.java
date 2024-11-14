package az.abbtech.lesson_3.tasks;

// TODO:
//  + Write a Java program to find the second most frequent character in a given string.
//      Sample Output:
//      The given string is: successes
//      The second most frequent char in the string is: c


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        String str = new Scanner(System.in).nextLine();
        int[] frequency = new int[256];
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++; //Converting char to int according to ASCII
        }

        int maxFreq = 0, secondMaxFreq = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > maxFreq) {
                secondMaxFreq = maxFreq;
                maxFreq = frequency[i];
            } else if (frequency[i] > secondMaxFreq && frequency[i] < maxFreq) {
                secondMaxFreq = frequency[i];
            }
        }

        for (int i = 0; i < 256; i++) {
            if (frequency[i] == secondMaxFreq) {
                System.out.println("The second most frequent char in the string is: " + (char) i);
                break;
            }
        }
    }

}
