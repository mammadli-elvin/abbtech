package az.abbtech.lesson_2.tasks;

//TODO:
// + Ededin reqemlerinin sayini tapin.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        int counter = 0;
        while(number != 0) {
            number /= 10;
            counter++;
        }
        System.out.println("The number of digits is: " + counter);

    }
}
