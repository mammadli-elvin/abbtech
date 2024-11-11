package az.abbtech.lesson_2;

import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {
//        ifcondition();
//        switchcondition();


        for(int x=0, y=0; x<50 && y<70; x++, y+=2 ) {
            System.out.println("x="+x + "y="+y);
        }


    }

    public static void ifcondition() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input your age: ");
        int age = scan.nextInt();

        if (age < 18 && age > 10) {
            System.out.println("You are juvenile");
        } else if (age > 18 && age < 65) {
            System.out.println("You are young");
        } else if (age > 65) {
            System.out.println("You are old");
        } else {
            System.out.println("You are child");
        }
    }

    public static void switchcondition() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = scan.nextInt();
        switch(age) {
            case 65:
                System.out.println("You are old");
                break;
            case 30:
                System.out.println("You are young");
                break;
            case 18:
                System.out.println("You are juvenile");
                break;
            default:
                System.out.println("You are child");
        }
    }
}
