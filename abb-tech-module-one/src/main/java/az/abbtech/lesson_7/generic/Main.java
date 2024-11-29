package az.abbtech.lesson_7.generic;

public class Main {
    public static void main(String[] args) {
        Car<Marka, Motor> car = new Car<>();
        System.out.println(car.marka);
        System.out.println(car.motor);
    }
}
