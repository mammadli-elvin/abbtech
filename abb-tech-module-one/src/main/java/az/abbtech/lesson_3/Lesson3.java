package az.abbtech.lesson_3;

//TODO:
// + Exercise 1:
//        Extract a Substring
//        Write a program that extracts a substring from a given string. Ask the user for the starting and ending indices and print the substring.
//        String text = "Hello, World!"
// + Exercise 2:
//        Replace Characters in a String
//        Write a program that replaces all occurrences of one character with another in a given string.
//        String text = "banana";
// + Exercise 3:
//        Check if a String Contains a Substring
//        Write a method to check if a given substring is present within a string
// + Exercise 4:
//        Print all elements of gives string
// + Exercise 5:
//        Check equality of String objects with reference and value
// + Exercise 6:
//        Calculate the sum of all elements in two dimension array

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
//        Task
        System.out.println("TASK1");
        String text = "Hello, World!";
        System.out.println("Enter index of the starting indicates: ");
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        System.out.println("Enter index of the ending indicates: ");
        int end = scanner.nextInt();

        String substring = text.substring(start, end);
        System.out.println(substring);

//        Task2
        System.out.println("TASK2");
        String txt = "banana";
        for(int i=0; i<text.length()-1; i++) {
            txt = text.replace('a', 'A');
        }
        System.out.println(txt);

//        Task3
        System.out.println("TASK3");
        System.out.println("Enter string: ");
        String s = new Scanner(System.in).nextLine();
        System.out.println("Enter substring: ");
        String substr = new Scanner(System.in).nextLine();
        boolean b = s.contains(substr);
        System.out.println(b);

//        Task4
        System.out.println("TASK4");
        String str = new Scanner(System.in).nextLine();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }

//        Task5
        System.out.println("TASK5");
        String str1 = new Scanner(System.in).nextLine();
        String str2 = new Scanner(System.in).nextLine();
        System.out.println(str1.equals(str2));
        System.out.println(str==str2);

//        Task6
        System.out.println("TASK6");
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println(sum);
    }
}
