package az.abbtech.lesson_2.tasks;

//TODO:
// + Calculator hazirlayın hər bir rəqəm və əmirlər(+,-,*,/,%) scannerlə daxil edilsin (switch-case ilə əmrləri sıralayın)

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter the apply: {+, -, *, /} ");
        String operation = scanner.next();
        switch (operation) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("Invalid apply");
        }

    }
}
