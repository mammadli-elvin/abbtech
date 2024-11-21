package az.abbtech.lesson_5.tasks.task_1;

public abstract class Vehicle {
    protected String brand;
    protected int year;

    protected Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    abstract void startEngine();

    abstract void move();

}
