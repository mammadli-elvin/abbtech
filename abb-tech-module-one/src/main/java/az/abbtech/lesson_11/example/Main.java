package az.abbtech.lesson_11.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        int input = new Scanner(System.in).nextInt();
        if(input < 10)  {
            throw new CustomerInputException("Input number less than 10");
        }
    }
}
