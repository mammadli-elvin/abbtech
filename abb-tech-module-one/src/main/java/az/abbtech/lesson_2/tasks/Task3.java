package az.abbtech.lesson_2.tasks;

//TODO:
// + Verilmish ededin butun reqemleri cemini tap.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {
            sum  += number % 10;
            number /= 10;
        }
        System.out.println("sum=" + sum);
    }
}
