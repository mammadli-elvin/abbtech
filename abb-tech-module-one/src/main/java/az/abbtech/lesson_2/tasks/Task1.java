package az.abbtech.lesson_2.tasks;

//TODO:
// + 0-dan verilmish edede qeder butun 2-ye bolune bilen ededleri chap et.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
