package az.abbtech.lesson_5.tasks.task_1;

public class Bicycle extends Vehicle {

    Bicycle(String brand, int year) {
        super(brand, year);
    }

    @Override
    void startEngine() {
        System.out.println("Bicycles don't have engines!");
    }

    @Override
    void move() {
        System.out.println("The bicycle pedals along the path.");
    }
}
