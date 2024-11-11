package az.abbtech.lesson_2.tasks;

//TODO:
// + Üçbucağın tərəflərinin düzgünlüyünü yoxlayan daha sonra isə sahəsini və perimetrini hesablayan alqoritm yazın.(a+b>c =>  bütün tərəflər üçün)

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Enter the length of each side of the triangle: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a < b + c && b < a + c && c < a + b) {
            double perimeter = a + b + c;
            System.out.println("Perimeter is " + perimeter);
            double halfPerimeter = perimeter / 2;
            double area = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c)); // formula Herona
            System.out.println("Area is " + area);
        } else {
            System.out.println("Invalid length");
        }
    }
}
