package az.abbtech.lesson_2.tasks;

//TODO:
// + 0-dan verilmish edede qeder sade ededleri chap et.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i % j == 0 && j != 1 && j != i) {   //if i can be divided by j other than 1 or i:
                    break;
                } else if (j == i) {    //if all delimiters are checked:
                    System.out.print(i + ", ");
                }
            }
        }

    }
}
