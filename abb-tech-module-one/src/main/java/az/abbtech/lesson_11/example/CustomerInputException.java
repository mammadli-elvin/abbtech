package az.abbtech.lesson_11.example;

public class CustomerInputException extends RuntimeException {
    private String message;

    public CustomerInputException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
