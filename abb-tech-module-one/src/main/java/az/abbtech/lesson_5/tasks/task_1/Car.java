package az.abbtech.lesson_5.tasks.task_1;

public class Car extends Vehicle {
    Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    void startEngine() {
        System.out.println("The car's engine roars to life!");
    }

    @Override
    void move() {
        System.out.println("The car drives down the road.");
    }
}
