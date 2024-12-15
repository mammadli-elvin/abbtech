package az.abbtech.lesson_11.tasks.task_1;

import java.util.Optional;
import java.util.Scanner;

public class SquareCalculator {

    public static void main(String[] args) {
        Optional<Integer> number = Optional.empty();

        Scanner scanner = new Scanner(System.in);

        while (number.isEmpty()) {

            System.out.println("Hello user, please enter an integer to print the square: ");
            String input = scanner.nextLine();
            try {
                number = Optional.of(validateAndParse(input));
            } catch (InvalidIntegerInputException exception) {
                System.out.println(exception.getMessage());
            }
        }
        number.ifPresent(i -> System.out.println("The square of " + i + " is " + Math.pow(i, 2) + "."));
    }

    private static int validateAndParse(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            throw new InvalidIntegerInputException("Invalid input. Please enter a valid integer.");
        }
    }


}
