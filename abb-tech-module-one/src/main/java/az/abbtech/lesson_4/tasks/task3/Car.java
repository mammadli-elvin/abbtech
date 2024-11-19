package az.abbtech.lesson_4.tasks.task3;

public class Car {
    public String brand;
    public String model;
    public int yearOfProduction;
    public String fuelType;
    public double speed = 0;

    public Car(String brand, String model, int yearOfProduction, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.fuelType = fuelType;
    }

    public void speed(double speedUp) {
        this.speed += speedUp;
    }

    public void slow(double slowDown) {
        this.speed -= slowDown;
    }

    public void stop() {
        this.speed = 0;
    }

    public String checkSpeed(double speedLimit) {
        boolean speedingWarning = this.speed > speedLimit;
        if (speedingWarning) {
           return "Be careful, you are speeding.";
        }
        return "Everything is okay.";
    }
}
