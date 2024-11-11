package az.abbtech.lesson_2.tasks;

//TODO:
// + İstifadəçidən ay nömrəsini daxil etməyi təklif edən proqram yazın. Sonra daxil edilmiş ay nömrəsinə əsasən həmin ayın adını çap edən keçid-case strukturundan istifadə edərək proqramı tamamlayın.

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Enter the number of month (1-12) which you want to process: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
