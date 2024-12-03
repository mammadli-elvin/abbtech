package az.abbtech.lesson_7.generic.example;

public class Car<T extends Marka, V> {
    public T marka;
    public V motor;

    public void getMarka() {
        System.out.println("Marka: " + marka);
    }

    public void getMotor() {
        System.out.println("Motor: " + motor);
    }
}
