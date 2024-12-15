package az.abbtech.lesson_11.tasks.task_2;

import java.util.Scanner;

public class TemperatureMeasurement {
    public static void main(String[] args) {
        try {
            double temperature = measureTemperature();
            System.out.println("Your temperature: " + temperature + "°C");
        } catch (InvalidInputException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }

    public static double measureTemperature() throws InvalidInputException {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter your temperature in degrees Celsius: ");
            double temperature = scanner.nextDouble();

            validateTemperature(temperature);
            return temperature;
        } catch (InvalidInputException exception) {
            throw exception;
        } catch (Exception exception) {
            throw new InvalidInputException("Invalid input! Please enter numeric value.");
        }
    }

    private static void validateTemperature(double temperature) throws InvalidInputException {
        if (temperature < 36 || temperature > 42) {
            throw new InvalidInputException("Invalid temperature! Please enter a value between 36 and 42°C.");
        }
    }
}
