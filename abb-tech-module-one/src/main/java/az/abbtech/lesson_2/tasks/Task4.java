package az.abbtech.lesson_2.tasks;

//TODO:
// + 3-cu deyishenden istifade etmeden 2 deyishenin yerini deyishmek

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        // a=11 b=9
        a = a + b;    // a = 11 + 9 = 20
        b = a - b;    // b = 20 - 9 = 11
        a = a - b;    // a = 20 - 11 = 9

        System.out.println("a = " + a + ", b = " + b);
    }
}
