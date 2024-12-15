package az.abbtech.lesson_11.lesson;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args) {
        Double aDouble = null;
        System.out.println("Enter a number: ");
        int b = new Scanner(System.in).nextInt();

        try {
            if (b == 0) {
                throw new ZeroDivideNotAllowedException("Zero Divide Not Allowed");
            }
        } catch (ArithmeticException | NullPointerException | ZeroDivideNotAllowedException exception) {
            if (exception instanceof ArithmeticException) {

            }
            if (exception instanceof NullPointerException) {

            }
            if (exception instanceof ZeroDivideNotAllowedException) {
                throw exception;
            }
        } catch (RuntimeException exception) {

        }
        System.out.println("After exception");
    }

}

