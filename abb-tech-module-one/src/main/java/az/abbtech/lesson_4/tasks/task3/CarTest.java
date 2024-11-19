package az.abbtech.lesson_4.tasks.task3;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Mercedes", "Cls", 2014, "Petrol");
        car.speed(150);
        System.out.println(car.checkSpeed(120));    //150 > 120 -> "Be careful, you are speeding".
        car.slow(60);
        car.stop();
    }
}
