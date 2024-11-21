package az.abbtech.lesson_5.tasks.task_1;

public class Main {
    public static void main(String[] args) {
        Car sedanCar = new Car("Cls", 2014);
        Bicycle speedBicycle = new Bicycle("Hoffman", 2020);

        sedanCar.startEngine();
        sedanCar.move();
        System.out.println();
        speedBicycle.startEngine();
        speedBicycle.move();
    }
}
